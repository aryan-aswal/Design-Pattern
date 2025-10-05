package StructuralDesignPattern.AdapterPattern.HttpConfig;

import java.net.URI;
import java.net.http.*;

public class HttpConfig {
    private final HttpClient client = HttpClient.newHttpClient();

    public String fetchResponse(String url) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response Status Code: " + response.statusCode());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getLocalizedMessage());
        }
        return response != null ? response.body() : null;
    }
}
