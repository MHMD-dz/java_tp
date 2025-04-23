package tp_5.exo_2;

public class Email {

    // variable
    public String adresse ;
    private String motPass ;
    private int phoneNumber ;

    // getter and setter
    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMotPass() {
        return motPass;
    }
    
    public void setMotPass(String motPass) {
        this.motPass = motPass;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // affichage
    public void Description(){
        System.out.println("the adress is: " + this.adresse);
        System.out.println("the mot pass is: " + this.motPass);
        System.out.println("the phone number is: " + this.phoneNumber);
    }

    // constractor
    public Email(String adresse , String motPass , int phoneNumber ){
        this.adresse = adresse ;
        this.motPass = motPass ;
        this.phoneNumber = phoneNumber ;
    }
    public Email(){}
}
