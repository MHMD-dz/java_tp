package tp_3.classes;

public class Licence_exo3 {
    
    // function
    public double serie_harmonique( double n){
        double result = 0.0 ;
        for (int i = 0 ; i < n ; i++) {
            result += 1.0 / i ;
        }
        return result ;
    }
}
