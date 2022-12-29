package fikt.oop.inki895.zadaca3;
import java.util.List;
import java.util.ArrayList;

public class Glavna {
    public static void main(String[] args){
        XmlCreator xml = new XmlCreator();
        List<Student> studenti = new ArrayList<Student>();
        studenti.add(new Student("Stefan", "Stefanovski", 100));
        studenti.add(new Student("Aleksandar", "Ristevski", 105));
        xml.createXMLFile("Zadaca3.xml", studenti);
    }
}
