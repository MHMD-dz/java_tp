package tp_3.classes;

public class Licence_exo4 {
    // function 

    public int max_of_table( int table[] ){
        int max = table[0] ;

        for (int i = 1 ; i < table.length ; i++) {
            if (max < table[i]) {
                max = table[i] ;
            }
        }
        return max ;
    }
}
