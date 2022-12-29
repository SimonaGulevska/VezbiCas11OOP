package fikt.oop.inki895.zadaca2;
import java.io.IOException;

public class Glavna {
    public static void main(String[] args){
        int x;
        String str="";
        try {
            System.out.println("Vnesete tekst:");
            while((x=System.in.read()) != 10)
                str+=(char)x;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
