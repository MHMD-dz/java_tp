package tp_6.exo2 ;

public class Test {

    public static void main(String[] args){
        // creating the objects 
        Student s1 = new Student("mohamed", "benzineb", "oran", "10/07", "123456", 7.25, 12.75, "info") ;
        Employee e1 = new Employee("walaa", "youla", "oran", "20/07", "10254", "10/07/2025");
        Enseignant es = new Enseignant("amine", "somthing", "bijaia", "2/22", "21547", "2022", "sergen", 24) ;

        // output
        System.out.println("*******************************");
        System.out.println("the student info:");
        s1.affichag();
        System.out.println("2025: " + s1.obs());
        System.out.println("*******************************");
        System.out.println("the Employee infe");
        e1.affichag();
        System.out.println("*******************************");
        System.out.println("the enseignant info");
        es.affichag();
        System.out.println("salari: " + es.salaireEnseignement() +" DA");
    }
}