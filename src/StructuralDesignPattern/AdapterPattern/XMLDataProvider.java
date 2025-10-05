package StructuralDesignPattern.AdapterPattern;

import StructuralDesignPattern.AdapterPattern.HttpConfig.HttpConfig;

public class XMLDataProvider {
    HttpConfig httpConfig = new HttpConfig();

    public String fetchXMLData(String url) {
        return httpConfig.fetchResponse(url);
    }
}
