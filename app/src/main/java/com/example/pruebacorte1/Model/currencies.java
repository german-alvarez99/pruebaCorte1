package com.example.pruebacorte1.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class currencies {
    private String code="";
    private String name="";
    private String symbol="";

    public currencies(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public currencies(JSONObject jsonObject) throws JSONException {
        code=jsonObject.getString("code").toString();
        name=jsonObject.getString("name").toString();
        symbol=jsonObject.getString("symbol").toString();
    }

    public static ArrayList<currencies> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<currencies> currenciesls = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            currenciesls.add(new currencies(datos.getJSONObject(i)));
        }
        return currenciesls;
    }
}
