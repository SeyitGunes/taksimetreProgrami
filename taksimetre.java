import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım
        int km;
        double perKm = 2.20, total, startPrice = 10;
        //Scanner sınıfını tanımlayalım
        Scanner input =new Scanner(System.in);

        //Kullanıcıdan isteğimizi belirtelim
        System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz: ");
        km = input.nextInt();

        //Formülümüzü yazalım
        total = perKm * km;
        total += startPrice;

        //Özel koşulumuzu belirtelim
        total = (total < 20) ? 20 : total;

        System.out.print(total);
    }
}
