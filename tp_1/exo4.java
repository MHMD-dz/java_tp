import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
    // exo 4

        // creating object
        Scanner scan = new Scanner(System.in);

        // variables 
        int a , b ;

        // user input 
        System.out.print("Enter the valeur of a: ");
        a = scan.nextInt();
        System.out.print("Enter the valeur of b: ");
        b = scan.nextInt();

        // output
        
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));





        scan.close();
}
}