package tp_5.exo_1;

public class Compt {
    
    // variable
    public double solde ;
    private int code ;
    public String nomClient ;

    // methods 
    public void diposit( double monye ){
        if (monye > 0) {
            this.solde += monye ;
        }else{
            System.out.println("Invalid input try again");
        }
    }
 
    public void withdro( double monye ){
        if (monye > 0 && monye <= solde) {
            this.solde -= monye ;
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
    public void affichage_compte() {
        System.out.println("Nom client : " + nomClient);
        System.out.println("Code : " + code);
        System.out.println("Solde : " + solde + " DA");
    }

    // constractor
    public Compt( double solde , int code , String nomClient){
        this.solde = solde ;
        this.code = code ;
        this.nomClient = nomClient ;
    }
    public Compt(){}
}
