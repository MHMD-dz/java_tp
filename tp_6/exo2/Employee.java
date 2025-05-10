package tp_6.exo2;

public class Employee extends Human{
    
    // att
    public String dateRec ;
    
    // const 
    public Employee(String firstName , String lastName , String address , String dateN , String phoneN , String dateRec){
        super(firstName, lastName, address, dateN, phoneN);
        this.dateRec = dateRec ;
    }
}
