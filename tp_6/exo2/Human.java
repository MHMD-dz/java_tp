package tp_6.exo2;

public class Human {
    // attribut
    public String firstName ;
    public String lastName ;
    public String address ;
    public String dateN ;
    public String phoneN ;

    // methods
    public void affichag(){
        System.out.println("Full name: " + firstName + " " + lastName + "\naddress: " + address + "\nbirthdate: " + dateN + "\nphone number: " + phoneN);
    }

    // constractor
    public Human( String firstName , String lastName , String address , String dateN , String phoneN){
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.address = address ;
        this.dateN = dateN ;
        this.phoneN = phoneN ;
    }
}
