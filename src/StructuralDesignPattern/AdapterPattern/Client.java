package StructuralDesignPattern.AdapterPattern;

public class Client {
    private final Report report = new XMLDataProviderAdapter();

    public String fetchJsonData(String url) {
        return report.fetchJsonData(url);
    }
}
