package tp_5.exo_1;

public class Main {
    public static void main (String[] arg){
        Compt mohamed = new Compt();

        // without constractor
        mohamed.setCode(1234);
        mohamed.nomClient = "mohamed benz" ;
        mohamed.solde = 2000 ;

        mohamed.diposit(500);
        mohamed.withdro(1500);
        mohamed.affichage_compte();

        // initialisation en utilisant un constructeurs
        Compt jiff = new Compt(1500,0000,"Jiff");
        jiff.affichage_compte();

    }
}