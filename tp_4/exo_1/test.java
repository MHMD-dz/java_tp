package tp_4.exo_1;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rec = new Rectangle() ;

        // variables
        double largeur ;
        double hauteur ;

        // user input 
        System.out.print("Enter the hauteur: ");
        hauteur = scan.nextDouble();
        System.out.print("Enter the largeur: ");
        largeur = scan.nextDouble();

        rec.affichage_rectangle(largeur, hauteur);

        scan.close();
    }
}