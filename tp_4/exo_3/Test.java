package tp_4.exo_3;

public class Test {
    public static void main(String[] args) {
        Email email = new Email();

        // testing 

        // testing des setters
        email.setAdresse("blabla@email.com");
        email.setMot_pass("passw");
        email.setNum_tel(5448153);

        // testing the getter
        System.out.println("Adresse: " + email.getAdresse());
        System.out.println("password: " + email.getMot_pass());
        System.out.println("phone number " + email.getNum_tel());
    }
}
