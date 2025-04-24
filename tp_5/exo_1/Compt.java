package tp_5.exo_1;

public class Compt {
    
    // variable
    public double solde ;
    private int code ;
    public String nomClient ;

    // methods 
    public void diposit( double monye , int code ){
        if (monye > 0 && this.code == code) {
            this.solde += monye ;
            System.out.println(monye + " DA has been added to "+ nomClient + " Balance");
        }else{
            System.out.println("Invalid input try again");
        }
    }
 
    public void withdro( double monye , int code ){
        if (monye > 0 && monye <= solde && this.code == code) {
            this.solde -= monye ;
            System.out.println(monye + " DA hase been withdrown from "+ nomClient + " Balance");
        }else{
            System.out.println("Invalid input try again");
        }
    }

    // getter & setter
    public void setCode(int code){
        this.code = code ;
    }
    public int getCode(){
        return code ;
    }

    // affichage
    public void affichage_compte(int code ) {
        if (this.code == code) {
        System.out.println("\nNom client : " + nomClient);
        System.out.println("Code : " + code);
        System.out.println("Solde : " + solde + " DA");
    }}

    // constractor
    public Compt( double solde , int code , String nomClient){
        this.solde = solde ;
        this.code = code ;
        this.nomClient = nomClient ;
    }
    public Compt(int code , String nomClient){
        this.code = code ;
        this.nomClient = nomClient ;
        // 100 da by defult
        this.solde = 100 ;
    }
}
