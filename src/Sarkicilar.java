
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();
    
    public void sarkicilari_yazdir(){
        
        System.out.println("\t Listede " + sarkici_listesi.size() +" tane sarkici var.");
          for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println("\t "+ (i+1) + ". " + sarkici_listesi.get(i));
        }
        System.out.println("--------------------------------------------------------");  
    }
    
    public void sarkici_ekle(String isim){
        
        sarkici_listesi.add(isim);
        System.out.println("\t Listeye yeni sarkici " + (isim) + " eklendi.");
        System.out.println("--------------------------------------------------------");
    }
    
    public void sarkici_güncelle(int index, String yeni_isim){
        if (index < sarkici_listesi.size()&& index >= 0 ) {
            sarkici_listesi.set(index, yeni_isim);
            System.out.println("\t Sarkici " + (yeni_isim) + " olarak güncellendi.");
            System.out.println("--------------------------------------------------------");
        }
        else{
            System.out.println("\t Aranan index bulunamadi...");
            System.out.println("--------------------------------------------------------");
        }   
    }
    
    public void sarkici_sil(int index){
        if (index >= 0 && index < sarkici_listesi.size()) {
            String isim = sarkici_listesi.get(index);
            sarkici_listesi.remove(index);
            System.out.println("\t Sarkici " + (isim) + " listeden silindi.");
            System.out.println("--------------------------------------------------------");
        }
        else{
            System.out.println("\t Aranan sarkici bulunamadi...");
            System.out.println("--------------------------------------------------------");
        }
    }
    
    //sarkici_ara metoduna equalsIgnoreCase metodu entegre edilecek.s
    public void sarkici_ara(String sarkici_ismi){
       int pozisyon = sarkici_listesi.indexOf(sarkici_ismi); //aranan şarkıcının indeksini arıyor
        if (pozisyon >= 0 ) { //aranan şarkıcı listede varsa 
            System.out.print("\t Aranan sarkici bulundu. ");
            System.out.println((sarkici_ismi) + "adlı sarkici " + (pozisyon+1) + ". sırada yer almaktadır.");
            System.out.println("--------------------------------------------------------");
        }
        else{
            System.out.println("\t Aranan sarkici bulunamadı.");
            System.out.println("--------------------------------------------------------");
        }  
    }
}
