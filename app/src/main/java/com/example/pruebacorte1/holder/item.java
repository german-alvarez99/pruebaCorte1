package com.example.pruebacorte1.holder;

import android.content.Context;
import android.widget.EditText;

import com.example.pruebacorte1.R;
import com.mindorks.placeholderview.Animation;
import com.mindorks.placeholderview.PlaceHolderView;
import com.mindorks.placeholderview.annotations.Animate;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;


@NonReusable
@Layout(R.layout.gallery_item)
public class item {
    @View(R.id.txt1)
    private EditText txt1;

    @View(R.id.txt2)
    private EditText txt2;

    private String mUlr;
    private Context mContext;
    private PlaceHolderView mPlaceHolderView;


    public item(Context context, PlaceHolderView placeHolderView, String url) {
        mContext = context;
        mPlaceHolderView = placeHolderView;
        mUlr = url;
    }



}
