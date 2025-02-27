import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
    // exo 3

        // creating object
        Scanner scan = new Scanner(System.in);

        // variables 
        int a , b ;
        float c ;

        // user input 
        System.out.print("Enter the valeur of a: ");
        a = scan.nextInt();
        System.out.print("Enter the valeur of b: ");
        b = scan.nextInt();

        // output
        c = (float)a / (float)b ;
        System.out.println(a + " / " + b + " = " + c);





        scan.close();
}
}