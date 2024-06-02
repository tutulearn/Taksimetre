import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmBasi=2.20,acilis=10,km,tutar;

        System.out.print("Gidilen mesafeyi giriniz: ");
        km=input.nextDouble();
        tutar=acilis+km*kmBasi;
        tutar=(tutar<20)?20:tutar;

        System.out.println("Ödenecek Tutar: " +tutar);



    }
}
