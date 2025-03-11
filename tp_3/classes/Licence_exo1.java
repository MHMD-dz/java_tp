package tp_3.classes;

public class Licence_exo1 {
    
    // variables 
    private int x , y , z ;

    // function

    // set functions
    public void set_x(int var){
        x = var ;
    }
    public void set_y(int var){
        y = var ;
    }
    public void set_z(int var){
        z = var ;
    }

    // get function
    public int get_x(){
        return x ;
    }
    public int get_y(){
        return y ;
    }
    public int get_z(){
        return z ;
    }

    // equal function
    public void equality(){
        if (x == y && y == z) {
            System.out.println("les trois valeurs sont égales");
        }
        else if (x == z) {
            System.out.println("seules la première et la troisième sont égales");
        }
        else if (x == y) {
            System.out.println("\"seules les deux premières valeurs sont égales\"");
        }
        else if (y == z) {
            System.out.println("seules les deux dernières valeurs sont égales");
        }
        else {
            System.out.println("les trois valeurs sont différentes");
        }
    }
    

}
