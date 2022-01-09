import java.util.Scanner;

public class Yildiz {

    public static void main(String[] args) {
 
    Scanner klavye=new Scanner(System.in);
        System.out.print("LÜTFEN YÜKSEKLİK DEĞERİNİ GİRİNİZ=");
        int yukseklik=klavye.nextInt();
        String yaz="";
        int i=1;
        while(yukseklik>0){
        String boşluk="";
        String yıldız="";
        int p=i;
        while(p>0){
        yıldız=yıldız+"*";
        p=p-1;
        }
        int q=yukseklik-1;
        while(q>0){
        boşluk=boşluk+"";
        q=q-1;
        }
        yaz=yaz+boşluk+yıldız+"\n";
        i=i+2;
        yukseklik--;
        }
System.out.println(yaz);
        
        
        
        
        
        
        
    }
    
}
