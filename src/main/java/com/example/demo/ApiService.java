package com.example.demo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class ApiService {
    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public dtoMessage fetchDataFromCApi() throws IOException {
        // Выполнение GET-запроса к сервису на C
        URL url = new URL("http://172.22.111.228:8083"); // Замените на ваш URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET"); // Или другой метод, если требуется
        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            System.out.println("Response OK");
        } else {
            System.out.println("Response not OK. Response code: " + responseCode);
        }
        connection.disconnect();
        return new dtoMessage("SUCCESS", "OK");
    }
}
