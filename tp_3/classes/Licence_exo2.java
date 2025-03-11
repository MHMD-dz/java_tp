package tp_3.classes;

public class Licence_exo2 {
    // variables 
    private String month ;

    // function 
    // set function
    public void set_month(String mon){
        month = mon ;
    }

    // get function 
    public String get_month(){
        return month ;
    }

    // exo function
    public void month_days(){
        switch (month) {
            case "January" : System.out.println("ther is 31 days in January ");
            break;
            case "February " : System.out.println("ther is 28 & 29 days in February  ");
            break;
            case "March" : System.out.println("ther is 31 days in March ");
            break;
            case "April" : System.out.println("ther is 30 days in April ");
            break;
            case "May" : System.out.println("ther is 31 days in May  ");
            break;
            case "June" : System.out.println("ther is 30 days in June ");
            break;
            case "July" : System.out.println("ther is 31 days in July ");
            break;
            case "August" : System.out.println("ther is 31 days in August ");
            break;
            case "September" : System.out.println("ther is 30 days in September ");
            break;
            case "October" : System.out.println("ther is 31 days in October ");
            break;
            case "November" : System.out.println("ther is 30 days in November ");
            break;
            case "December" : System.out.println("ther is 31 days in December ");
            break;
        
            default: System.out.println("ERROR you enterd wrongh month");
                break;
        }
    }
}
