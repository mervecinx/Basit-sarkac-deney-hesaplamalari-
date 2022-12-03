import java.util.*;
public class Main {
    public static void main(String[] args) {

        double PI=3.14;
        int GTEORIK=981;

        System.out.println(" ");
        System.out.println("Basit sarkaç");
        System.out.println("Lütfen ondalıklı sayıları virgül (,) kullanarak giriniz ");

        //Aralıklar arası süre hesaplama
        Scanner input = new Scanner(System.in);
        System.out.print("Frekans değerini giriniz = ");
        double frekans = input.nextDouble();
        double periyot=(1/frekans);
        System.out.println("t = " +periyot);
        System.out.println(" ");

        //Masa eğimi hesaplama
        System.out.println("Masa Eğimi: ");
        System.out.print("Masanın yüksekte olan kenarının yere olan uzunluk değerini giriniz= ");
        double masaUzunlukIki = input.nextDouble();
        System.out.print("Masanın alçakta olan kenarının yere olan uzunluk değerini giriniz= ");
        double masaUzunlukBir = input.nextDouble();

        double masaAci =((masaUzunlukIki-masaUzunlukBir)/65.0);
        System.out.println(" ");

        // L ip uzunluk değerleri
        double[] ip = new double[3];
        System.out.println("Sırasıyle ipin uzunluklarını girin = ");

        int j=1;
        for (int i=0; i< ip.length;i++){
            System.out.print("L"+j+ " = " );
            j++;
            ip[i]= input.nextDouble();
        }
        System.out.println(" ");

        //Aralık sayıları
        double[] zaman =new double[3];
        double[] nokta = new double[3];
        System.out.println("Sırasıyla bir dalga boyunda bulunan nokta sayılarını giriniz  = ");

        int k=1;
        for (int a=0; a< nokta.length;a++){
            nokta[a]= input.nextDouble();
            zaman[a]=(nokta[a]*periyot)*(nokta[a]*periyot);
            System.out.println("T^2 " +k+ " = " +zaman[a]);
            k++;
        }
        System.out.println(" ");


        //hesaplamalar

        // tanΘ=ΔL/Δt^2
        double tanTeta = (ip[2]-ip[0])/(zaman[2]-zaman[0]);
        System.out.println("TanΘ= " +tanTeta);
        System.out.println(" ");

        //gdeneysel=( (4*π*π) / sinØ )*tanΘ
        double gDeneysel = (4*(PI*PI)/masaAci)*tanTeta;
        System.out.println("g teorik yer çekimi= 981 cm/s^2");
        System.out.println("g deneysel yer çekimi= " +gDeneysel); 
        System.out.println(" ");

        //Bağıl hata= | ( (teorik d. - deneysel d.)/teorik d. )| * 100
        double bagilHata = ((GTEORIK-gDeneysel)/GTEORIK)*100;
        System.out.println("Yüzde bağıl hata= " +bagilHata);



    }
}