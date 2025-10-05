package StructuralDesignPattern.AdapterPattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class XMLDataProviderAdapter implements Report {
    XMLDataProvider provider = new XMLDataProvider();

    @Override
    public String fetchJsonData(String url) {
        String xmlData = provider.fetchXMLData(url);
        return convertXMLToJson(xmlData);
    }

    public String convertXMLToJson(String data) {
        String result = "";
        try {
            // Parse XML
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(data.getBytes()));
            Element root = doc.getDocumentElement();

            // Convert to JSON string
            result = toJson(root);
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getLocalizedMessage());
        }
        return result;
    }

    private String toJson(Element element) {
        StringBuilder json = new StringBuilder("{");
        NodeList children = element.getChildNodes();

        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);

            if (node instanceof Element child) {
                json.append("\"").append(child.getTagName()).append("\": ");
                json.append("\"").append(child.getTextContent().trim()).append("\"");

                if (i < children.getLength() - 1)
                    json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}
