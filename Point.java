import java.util.*;


public class Point {

    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void initialiser(int x, int y){
        this.x = x;
        this.y = y;
    }

    void deplacer(int x, int y){
        this.x += x;
        this.y += y;
    }

    void afficher(){
        System.out.println("je suis un point de coordonées "+this.x+" et "+this.y);
    }
}
