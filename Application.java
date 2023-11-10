

public class Application{
    public static void main(String[] args){
        Point point = new Point();

        point.initialize(2, 3);
        point.display();
        point.displace(4, 1);
        point.display();
        point.displace(-2, -10);
        point.display();
        point.displace(8, 0);
        point.display();
    }
}