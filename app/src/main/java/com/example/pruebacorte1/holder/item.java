package com.example.pruebacorte1.holder;

import android.content.Context;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.pruebacorte1.R;
import com.mindorks.placeholderview.PlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.View;


@Layout(R.layout.gallery_item)
public class item{
    @View(R.id.imageView)
    private ImageView imageView;

    @View(R.id.txt)
    private EditText txtNombrePais;

    private String mUlr= "http://www.geognos.com/api/en/countries/flag/";
    private Context mContext;
    private PlaceHolderView mPlaceHolderView;


    public item(Context context, PlaceHolderView placeHolderView, String nombrePais, String codigoPais) {
        mContext = context;
        mPlaceHolderView = placeHolderView;
        txtNombrePais.setText(nombrePais);
        mUlr = mUlr+codigoPais+".png";
        Glide.with(mContext).load(mUlr).into(imageView);
    }

}
