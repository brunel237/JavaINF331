import java.util.*;


public class Point {

    int x, y;

    void initialize(int x, int y){
        this.x = x;
        this.y = y;
    }

    void displace(int x, int y){
        this.x += x;
        this.y += y;
    }

    void display(){
        System.out.println("je suis un point de coordonées "+this.x+" et "+this.y);
    }
}
