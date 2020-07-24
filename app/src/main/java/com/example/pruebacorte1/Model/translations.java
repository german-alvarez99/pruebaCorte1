package com.example.pruebacorte1.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class translations {
    private String codigo="";
    private String valor="";

    public translations(String codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public translations(JSONObject jsonObject) throws JSONException {
        codigo=jsonObject.getString("codigo").toString();
        valor=jsonObject.getString("valor").toString();
    }

    public static ArrayList<translations> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<translations> translationsls = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            translationsls.add(new translations(datos.getJSONObject(i)));
        }
        return translationsls;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
