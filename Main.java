import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double boy, idx;
        int kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Scanner inp = new Scanner(System.in);
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        Scanner inp2 = new Scanner(System.in);
        kilo = inp2.nextInt();

        idx = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+idx);

    }
}