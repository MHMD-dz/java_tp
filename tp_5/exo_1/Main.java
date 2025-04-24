package tp_5.exo_1;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        // creating object
        Compt lilian = new Compt(2000, 2525 , "lilian" );
        Compt mohamed = new Compt( 1007 , "mohamed" );
        Scanner scan = new Scanner(System.in);

        // variables
        double monye ;
        int code ;

        // user input
        // diposit !
        System.out.print("Enter the amount of monye u want to deposit: ");
        monye = scan.nextDouble();
        System.out.print("Enter the password to validate ur diposit: ");
        code = scan.nextInt();
        System.out.println("");
        mohamed.diposit(monye , code);
        System.out.println("");

        // withdrow !
        System.out.print("Enter the amount of monye u want to withdrow: ");
        monye = scan.nextDouble();
        System.out.print("Enter the password to validate ur withdrow: ");
        code = scan.nextInt();
        System.out.println("");
        mohamed.withdro(monye , code);
        System.out.println("");

        // afichage
        System.out.print("Enter the password to see the account info: ");
        code = scan.nextInt();

        mohamed.setCode(code);
        mohamed.affichage_compte(code);

        // lilian affichage
        lilian.affichage_compte(2525);

    }
}