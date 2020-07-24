package com.example.pruebacorte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.pruebacorte1.Adapter.adapterPais;
import com.example.pruebacorte1.Model.Pais;
import com.example.pruebacorte1.WebService.Asynchtask;
import com.example.pruebacorte1.WebService.WebService;

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

            //agregar datos al recyclerView
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcPais);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

            adapterPais adapter= new adapterPais(lstPais);
            recyclerView.setAdapter(adapter);
        }catch (JSONException e)
        {
            Toast.makeText(this.getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG);
        }
    }
}