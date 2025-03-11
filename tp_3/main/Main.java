package tp_3.main;
import tp_3.classes.Licence_exo1;
import tp_3.classes.Licence_exo2;
import tp_3.classes.Licence_exo3;
import tp_3.classes.Licence_exo4;
import tp_3.classes.Licence_exo5;

public class Main {
    public static void main(String[] arg){

        // creating the object
        Licence_exo1 exo1 = new Licence_exo1() ;
        Licence_exo2 exo2 = new Licence_exo2() ;
        Licence_exo3 exo3 = new Licence_exo3() ;
        Licence_exo4 exo4 = new Licence_exo4() ;
        Licence_exo5 exo5 = new Licence_exo5() ;

        // setining the value
        int tabel[] = {1, 45, 78, 98, 4} ;
        exo1.set_x(5);
        exo1.set_y(5);
        exo1.set_z(5);
        exo2.set_month("July" );

        // testing the function
        exo1.equality();
        exo2.month_days();
        exo3.serie_harmonique(10);
        exo4.max_of_table(tabel);
        exo5.factoriel(10) ;

    }
}
