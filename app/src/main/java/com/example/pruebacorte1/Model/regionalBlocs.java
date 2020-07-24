package com.example.pruebacorte1.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class regionalBlocs {
    private String acronym="";
    private String name="";
    private String otherAcronyms="";
    private String otherNames="";

    public regionalBlocs(String acronym, String name, String otherAcronyms, String otherNames) {
        this.acronym = acronym;
        this.name = name;
        this.otherAcronyms = otherAcronyms;
        this.otherNames = otherNames;
    }
    public regionalBlocs(JSONObject jsonObject) throws JSONException {
        acronym=jsonObject.getString("acronym").toString();
        name=jsonObject.getString("name").toString();
        otherAcronyms=jsonObject.getString("otherAcronyms").toString();
        otherNames=jsonObject.getString("otherNames").toString();
    }

    public static ArrayList<regionalBlocs> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<regionalBlocs> regionalBlocsls = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            regionalBlocsls.add(new regionalBlocs(datos.getJSONObject(i)));
        }
        return regionalBlocsls;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(String otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }
}
