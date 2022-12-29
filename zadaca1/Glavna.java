package fikt.oop.inki895.zadaca1;
import java.io.IOException;

public class Glavna {
    public static void main(String[] args)throws IOException{
        Datoteka d=new Datoteka("Zadaca1.txt");
        d.zapishi("Ovoj tekst ke bide zapishan vo fajlot");
        d.prochitaj();
    }
}
