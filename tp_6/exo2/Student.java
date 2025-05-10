package tp_6.exo2;

public class Student extends Human{

    // att
    public double moy1 , moy2 ;
    public String depart ;

    // methods
    public double moyAnne(){
        return (moy1+moy2)/2 ;
    }
    public String obs(){
        if (moyAnne() >= 10) return "admis" ;
        else return "ajourne" ;
    }

    // const 
    public Student(String firstName , String lastName , String address , String dateN , String phoneN , double moy1 , double moy2 , String depart){
        super(firstName, lastName, address, dateN, phoneN);
        this.moy1 = moy1 ;
        this.moy2 = moy2 ;
        this.depart = depart ;
    }
}
