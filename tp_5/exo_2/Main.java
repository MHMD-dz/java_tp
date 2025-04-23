package tp_5.exo_2;

public class Main {
    public static void main (String[] arge){
        // object
        Email mail = new Email();

        // setter
        mail.setAdresse("hi@gmail.com");
        mail.setMotPass("cat2003");
        mail.setPhoneNumber(2154875);

        // affichage
        mail.Description();

        // initialisation using constractor
        Email hotmaim = new Email("123456@gmail.com", "236582", 215845);
        hotmaim.Description();

    }
}