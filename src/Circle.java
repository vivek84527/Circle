public class Circle {

    double x,y;
    double r;
    Circle(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    double circumference(){
        return 2*3.14*r;

    }
   double area(){
        return 3.14*r*r;
    }
}
