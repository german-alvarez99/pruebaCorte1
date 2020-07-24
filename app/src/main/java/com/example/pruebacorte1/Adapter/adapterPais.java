package com.example.pruebacorte1.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pruebacorte1.Model.Pais;
import com.example.pruebacorte1.R;
import com.example.pruebacorte1.MainActivity2;

import java.util.List;

public class adapterPais extends RecyclerView.Adapter<adapterPais.ViewHolderPais> {

    List<Pais> lstPais;

    public adapterPais(List<Pais> lstPais) {
        this.lstPais = lstPais;
    }

    @NonNull
    @Override
    public ViewHolderPais onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gallery_item,null,false);
        return new ViewHolderPais(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPais holder, int position) {
        holder.nombrePais.setText(lstPais.get(position).getNombre());
        holder.codigoPaisHolder=(lstPais.get(position).getCodBand());
        Glide.with(holder.itemView)
                .load("http://www.geognos.com/api/en/countries/flag/"+lstPais.get(position).getCodBand()+".png")
                .into(holder.imagen);
    }

    @Override
    public int getItemCount() {
        return lstPais.size();
    }

    public class ViewHolderPais extends RecyclerView.ViewHolder {
        TextView nombrePais;
        ImageView imagen;
        String codigoPaisHolder;

        public ViewHolderPais(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), MainActivity2.class);
                    i.putExtra("codigo",  codigoPaisHolder);
                    v.getContext().startActivity(i);
                }
            });
            nombrePais=(TextView) itemView.findViewById(R.id.txtNombrePais);
            imagen=(ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
