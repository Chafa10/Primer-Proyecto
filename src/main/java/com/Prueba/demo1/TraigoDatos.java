package com.Prueba.demo1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TraigoDatos {

    public String Dolares;

    public static void ExtraccionDeDatos() {


        try {
            Document doc = Jsoup.connect("https://www.infobae.com/economia/divisas/dolar-hoy/").get();
            Elements tiposDeDolares = doc.select("div.excbar");

            for (Element Dolar : tiposDeDolares.select("a")) {
                String Tipos = Dolar.text();


                System.out.println(Tipos);

                JSONArray arrayTiposDeDolar = new JSONArray();
                JSONObject objetoDolar = new JSONObject();

            }
        }catch (Exception e){
            System.out.println("Error en la extraccion de datos");
        }




    }


}
