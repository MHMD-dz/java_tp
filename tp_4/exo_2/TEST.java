package tp_4.exo_2;
import java.util.Scanner;
public class TEST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Compte mony = new Compte();

        // variables
        double cach ;

        // user input
        System.out.print("how much mony u whant to diposit: ");
        cach = scan.nextDouble() ;
        mony.crediter(cach);

        System.out.print("how much mony u whant to withdro: ");
        cach = scan.nextDouble() ;
        mony.debiter(cach);

        mony.affichage_compte();
        
        scan.close();
    }
}