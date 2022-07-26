package Entrance;
import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        a = input.nextInt();
        Scanner apu = new Scanner(System.in);
        System.out.print("Fizik Notunuzu Giriniz: ");
        b = apu.nextInt();
        Scanner bpu = new Scanner(System.in);
        System.out.print("Kimya Notunuzu Giriniz: ");
        c = bpu.nextInt();
        Scanner cpu = new Scanner(System.in);
        System.out.print("Biyoloji Notunuzu Giriniz: ");
        d = cpu.nextInt();
        Scanner dpu = new Scanner(System.in);
        System.out.print("Türkçe Notunuzu Giriniz: ");
        e = dpu.nextInt();
        Scanner epu = new Scanner(System.in);
        System.out.print("Müzik Notunuzu Giriniz: ");
        f = epu.nextInt();

        double total =(a+b+c+d+e+f)/6.0;
        String truth =(total>=60) ? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.print(truth);
    }
}
