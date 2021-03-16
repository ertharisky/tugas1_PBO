package tugaspbo;
import java.util.Scanner;

public class TugasPBO{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        double Gallons;
        double count;
        
        System.out.println("Konversi Satuan Liter Galon");
        System.out.println("\nMasukkan Jumlah Galon : ");
        
        Gallons = scan.nextDouble();
        count = Gallons *3.785f;
        
        System.out.printf("%.0f Galon = %.3f Liter \n\n", Gallons, count);
    }
}
