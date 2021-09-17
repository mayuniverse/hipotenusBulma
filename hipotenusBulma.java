import java.util.Scanner; 

public class hipotenusBulma {
public static void main(String[] args) {
    // değişkenleri tanımlayalım
    double kisaKenar,uzunKenar,hipotenus;

    // import sınıfını tanımlayalım
    Scanner input = new Scanner(System.in);

    // kullanıcıdan çıktı alalım
    System.out.println("kısa kenarı giriniz");
    kisaKenar = input.nextDouble();
    //System.out.println("kisa kenarınız " + kisaKenar);

    System.out.println("uzun kenarı giriniz");
    uzunKenar = input.nextDouble();
    //System.out.println("uzun kenarınız " + uzunKenar);

    // hipotenüs islemini tanımlayalım Math.sqrt işlemin karekökünü almayı sağlar
    hipotenus = Math.sqrt(kisaKenar*kisaKenar + uzunKenar*uzunKenar);


    // çıktımızı alalım
    System.out.println("Kısa kenarınız " + kisaKenar);
    System.out.println("Uzun kenarınız " + uzunKenar);
    System.out.println("Hipotenus " + hipotenus);}
}