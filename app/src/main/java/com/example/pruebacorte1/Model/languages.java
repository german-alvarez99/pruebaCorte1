package com.example.pruebacorte1.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class languages {
    private String iso639_1="";
    private String iso639_2="";
    private String name="";
    private String nativeName="";

    public languages(String iso639_1, String iso639_2, String name, String nativeName) {
        this.iso639_1 = iso639_1;
        this.iso639_2 = iso639_2;
        this.name = name;
        this.nativeName = nativeName;
    }

    public languages(JSONObject jsonObject) throws JSONException {
        iso639_1=jsonObject.getString("iso639_1").toString();
        iso639_2=jsonObject.getString("iso639_2").toString();
        name=jsonObject.getString("name").toString();
        nativeName=jsonObject.getString("nativeName").toString();
    }

    public static ArrayList<languages> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<languages> languagesls = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            languagesls.add(new languages(datos.getJSONObject(i)));
        }
        return languagesls;
    }

    public String getIso639_1() {
        return iso639_1;
    }

    public void setIso639_1(String iso639_1) {
        this.iso639_1 = iso639_1;
    }

    public String getIso639_2() {
        return iso639_2;
    }

    public void setIso639_2(String iso639_2) {
        this.iso639_2 = iso639_2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }
}
