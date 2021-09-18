package com.company;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;

// Пример честно подглядел в ютубе :)
public class AccWeatherGet {
    private static String apiKey = "E7vrUVT81A7GeAKXpWaihecVDTXIQuJl";
    public static void doHttpGet (){
    String url = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?language=ru-ru&details=true&metric=true&apikey=" + apiKey;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);

        try {
            CloseableHttpResponse resp = client.execute(httpGet);
            HttpEntity entity = resp.getEntity();
            System.out.println("Json response: ");
            System.out.println(EntityUtils.toString(entity));
            // Для записи в файл делаем еще одни запрос
            resp = client.execute(httpGet);
            entity = resp.getEntity();
            FileWriter file = new FileWriter("output.json");
            file.write(EntityUtils.toString(entity));
            file.flush();
            file.close();


        } catch (IOException e) {
            System.err.println("IO error");
            e.printStackTrace();
        }



    }
}
class HomeWork6 {
    public static void main(String[] args) {
        AccWeatherGet.doHttpGet();
    }
}
