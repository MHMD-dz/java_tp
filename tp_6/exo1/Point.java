package tp_6.exo1;

public class Point {
    // attribut
    private int x ;
    private int y ;

    // getter & setter
    public void setX (int x){
        this.x = x ;
    }
    public void setY (int y){
        this.y = y ;
    }
    public int getX(){
        return x ;
    }
    public int getY(){
        return y ;
    }

    // methods
    public void deplacer(int dx , int dy){
        this.x += dx ;
        this.y += dy ;
    }


}