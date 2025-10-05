package StructuralDesignPattern.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        String url = "https://mocktarget.apigee.net/xml";
        Client client = new Client();
        String data = client.fetchJsonData(url);
        System.out.println("JSON data: " + data);
    }
}
