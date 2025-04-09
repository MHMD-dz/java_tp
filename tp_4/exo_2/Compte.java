package tp_4.exo_2;

public class Compte {
    
    // variables 
    public double solde ;
    private int code ;

    //methode 
    public void crediter(double montant) {
        if (montant > 0){
            solde += montant;
            System.out.println(montant + " hase ben added to ur account");
        }else {
            System.out.println("Error invalid number !");
        }
    }

    public void debiter(double montant) {
        if (montant > 0 && solde >= montant ){
            solde -= montant;
            System.out.println(montant + " added to the account " );
        } else {
            System.out.println("invalid number try again");
        }
    }

    public void affichage_compte() {
        System.out.println("your account:");
        System.out.println("monye : " + solde + " DA");
    }
}
