package fikt.oop.inki895.zadaca3;
import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlCreator {
    public void createXMLFile(String fileName, List<Student> listaNaStudenti) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Studenti");
            document.appendChild(root);

            for (int i=0;i<listaNaStudenti.size();i++) {
                Element studentElement = document.createElement("Student");
                root.appendChild(studentElement);
                studentElement.setAttribute("id",String.valueOf(i));

                Element ime =  document.createElement("Ime");
                studentElement.appendChild(ime);
                ime.appendChild(document.createTextNode(listaNaStudenti.get(i).getIme()));

                Element prezime = document.createElement("Prezime");
                studentElement.appendChild(prezime);
                prezime.appendChild(document.createTextNode(listaNaStudenti.get(i).getPrezime()));

                Element index = document.createElement("Index");
                studentElement.appendChild(index);
                index.appendChild(document.createTextNode(String.valueOf(listaNaStudenti.get(i).getIndex())));
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource src = new DOMSource(document);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(src, result);
            System.out.println("Fajlot e kreiran so ime - "+ fileName);

            System.out.println("Fajlot e zachuvan");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
