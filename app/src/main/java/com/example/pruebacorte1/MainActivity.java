package com.example.pruebacorte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.pruebacorte1.Model.Pais;
import com.example.pruebacorte1.WebService.Asynchtask;
import com.example.pruebacorte1.WebService.WebService;
import com.example.pruebacorte1.holder.item;
import com.mindorks.placeholderview.PlaceHolderView;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("https://restcountries.eu/rest/v2/all",
                datos, MainActivity.this, MainActivity.this);
        ws.execute("GET");
    }

    @Override
    public void processFinish(String result) throws JSONException {
        ArrayList<Pais> lstPais = new ArrayList<Pais> ();
        try {
            JSONArray JSONlistaRestaurants= new JSONArray(result);
            lstPais = Pais.JsonObjectsBuild(JSONlistaRestaurants);


            PlaceHolderView mGalleryView = (PlaceHolderView)findViewById(R.id.galleryView);
            mGalleryView.getBuilder()
                    .setHasFixedSize(false)
                    .setItemViewCacheSize(10)
                    .setLayoutManager(new GridLayoutManager(this, 3));
            for (int i=0; i<lstPais.size();i++)
            {
                mGalleryView.addView(new item(this.getApplicationContext(), mGalleryView, lstPais.get(i).getNombre(), lstPais.get(i).getCodBand()));
            }
        }catch (JSONException e)
        {
            Toast.makeText(this.getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG);
        }
    }
}