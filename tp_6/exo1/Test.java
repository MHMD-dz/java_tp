package tp_6.exo1;

public class Test {
    public static void main (String[] arg){
        Point p1 = new Point() ;
        PointA p2 = new PointA() ;

        p2.setX(10);
        p2.setY(20);
        p2.affichag();
        p2.deplacer(20, 10);
        p2.affichag();
    }
    
}
