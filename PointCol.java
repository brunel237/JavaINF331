import java.util.*;

public class PointCol extends Point {

    byte couleur;   

    void colorer(byte couleur){      
        this.couleur = couleur;
    }

    void afficheCol(){
        this.afficher();
        System.out.println("je suis de couleur "+this.couleur);
    }

    PointCol(int x, int y, byte couleur){
        super(x,y);
        this.couleur = couleur;
    }
}