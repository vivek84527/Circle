import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {
        Circle c = new Circle(10,20,5);
        /*c.x = 10;
        c.y = 20;
        c.r = 5;*/
        double area = c.area();
        double circumference = c.circumference();
        System.out.println(area);


    }
}
