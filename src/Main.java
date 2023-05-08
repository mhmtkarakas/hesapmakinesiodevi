
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           int n1,n2;
           char islem = '*';

           Scanner input = new Scanner(System.in);

           System.out.print("ilk sayiyi giriniz : ");
           n1 = input.nextInt();
           System.out.print("ikinci sayiyi giriniz : ");
           n2 = input.nextInt();

           System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
           System.out.print("Seciminiz : ");



        switch (islem) {
            case '+':
                System.out.print("Toplam : " +(n1 + n2));
                break;
            case '-':
                System.out.print("Cikarma : " +(n1 - n2));
                break;
            case '*':
                System.out.print("Carpma : " +(n1 * n2));
                break;
            case '/':
                System.out.print("Bolme : " +(n2!=0 ? (n1/n2): "Bir sayi sifira bolunemez! "));

                break;
                default:
                  System.out.print("Yanlis secim yaptiniz lutfen tekrar deneyin ");
        }











    }
}