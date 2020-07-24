package com.example.pruebacorte1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebacorte1.Model.Pais;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class adapterPais extends RecyclerView.Adapter<adapterPais.ViewHolderRestaurant> {

    List<Pais> lstPais;

    public adapterPais(List<Pais> lstPais) {
        this.lstPais = lstPais;
    }

    @NonNull
    @Override
    public ViewHolderRestaurant onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRestaurant holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderRestaurant extends RecyclerView.ViewHolder {
        public ViewHolderRestaurant(@NonNull View itemView) {
            super(itemView);
        }
    }
}
