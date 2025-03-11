package tp_2;
import java.util.Scanner;
public class exo1 {
    public static void main (String[] arg){
        // creating object
        Scanner scan = new Scanner(System.in);

        // variable
        String product_name ;
        float prix ;
        int quantity ;

        // user input
        System.out.print("Enter the name of the prodect that u want: ");
        product_name = scan.nextLine();
        System.out.print("Enter the prix of the product: ");
        prix = scan.nextFloat();
        System.out.print("Enter how much of the product u want: ");
        quantity = scan.nextInt();

        // output
        System.out.println("You demanded " + quantity + " of " + product_name);
        System.out.println("The total prix is: " + ( quantity * prix ));



        scan.close();
    }
    
}
