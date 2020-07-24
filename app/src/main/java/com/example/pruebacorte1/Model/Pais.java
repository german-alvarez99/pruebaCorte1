package com.example.pruebacorte1.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Pais {
    private String nombre="";
    private String codBand="";
    private String topLevelDomain="";//
    private String alpha2Code="";
    private String alpha3Code="";
    private String callingCodes="";//
    private String capital="";
    private String altSpellings="";//
    private String region="";
    private String subregion="";
    private String population="";
    private String latlng="";//int
    private String demonym="";
    private String area="";
    private String gini="";
    private String timezones="";//
    private String borders="";//
    private String nativeName="";
    private String numericCode="";
    private String flag="";
    private String cioc="";
    private ArrayList<currencies> v_currencies;
    private ArrayList<languages> v_languages;
    private ArrayList<translations> v_translations;
    private ArrayList<regionalBlocs> v_regionalBlocs;

    public Pais(JSONObject jsonObject,int a) throws JSONException {
        nombre=jsonObject.getString("name").toString();
        codBand=jsonObject.getString("alpha2Code").toString();
    }

    public static ArrayList<Pais> JsonObjectsBuild2(JSONArray datos) throws JSONException {
        ArrayList<Pais> pais = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            pais.add(new Pais(datos.getJSONObject(i),1));
        }
        return pais;
    }










    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodBand() {
        return codBand;
    }

    public void setCodBand(String codBand) {
        this.codBand = codBand;
    }

    public Pais(String nombre, String codBand) {
        this.nombre = nombre;
        this.codBand = codBand;
    }

    public Pais(JSONObject jsonObject) throws JSONException {
        nombre=jsonObject.getString("name").toString();
        codBand=jsonObject.getString("alpha2Code").toString();

    }

    public static ArrayList<Pais> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Pais> pais = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            pais.add(new Pais(datos.getJSONObject(i)));
        }
        return pais;
    }
}
