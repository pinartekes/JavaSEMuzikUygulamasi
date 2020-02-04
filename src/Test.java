
import java.util.Scanner;


public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner= new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("\t 0 - İslemleri Görüntüle");
        System.out.println("\t 1 - Sarkicilari Görüntüle");
        System.out.println("\t 2 - Sarkici Ekle");
        System.out.println("\t 3 - Sarkici Güncelle");
        System.out.println("\t 4 - Sarkici Sil");
        System.out.println("\t 5 - Sarkici Ara");
        System.out.println("\t 6 - Uygulamadan Cik"); 
    }
    
    public static void sarkicilari_goruntule(){
        sarkicilar.sarkicilari_yazdir();
    }
    
    public static void sarkici_ekle(){
        System.out.print("\t Eklemek istediginiz sarkicinin  adini giriniz: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    
    public static void sarkici_guncelle(){
        System.out.print("\t Güncellemek istediğiniz index'i giriniz (1,2,3,..): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("\t Guncellemek istediginiz adi giriniz: ");
        String yeni_isim = scanner.nextLine();
        
        sarkicilar.sarkici_güncelle(index-1, yeni_isim);
    }
    
    public static void sil(){
        System.out.print("\t Silmek istediginiz index'i giriniz: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        sarkicilar.sarkici_sil(index-1);
    }
    
    public static void ara(){
        System.out.print("\t Aramak istediginiz sarkici: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    
    public static void main(String args[]){
        
        System.out.println("\t\t- Sarkici Uygulamasina Hosgeldiniz -");
        islemleri_bastir();
        boolean cikis = false;
        int islem;
        while(!cikis){
            System.out.print("Bir islem seciniz : ");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;  
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.print("\t Uygulamadan cikiliyor....");
                    break;
                default:
                        System.out.println("Gecersiz islem girdiniz....");
            }
        }
    }
}
