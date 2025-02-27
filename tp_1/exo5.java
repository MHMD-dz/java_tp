public class exo5 {
    public static void main(String[] args) {
    // exo 5

    int valeur = 7, chiffre = 2 , i1 , i2 ;
    float f1, f2 ;
    i1 = valeur / chiffre ;
    i2 = chiffre / valeur ;
    f1 = (float) (valeur / chiffre) ;
    f2 = (float) (valeur / chiffre) + 0.5f ;
    i1 = (int) f1 ;
    i2 = (int) f2 ;
    f1 = (float) valeur / (float) chiffre ;
    f2 = (float) valeur / (float) chiffre + 0.5f ;
    i1 = (int) f1 ;
    i2 = (int) f2 ;

    }
}