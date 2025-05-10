package tp_6.exo2;

public class Enseignant extends Employee {
    // att
    public String grade ;
    public int nbHoure ;

    // methode 
    public int salaireEnseignement(){
        return nbHoure * 4 * 1500 ;
    }

    // const 
    public Enseignant(String firstName , String lastName , String address , String dateN , String phoneN , String dateRec , String grade , int nbHoure){
        super(firstName, lastName, address, dateN, phoneN , dateRec);
        this.grade = grade ;
        this.nbHoure = nbHoure ;
    }
    
}
