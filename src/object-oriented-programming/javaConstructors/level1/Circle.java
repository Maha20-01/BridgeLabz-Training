package level1;

class circle1 {

    private double radius;

    public circle1() {
        this(1.0); 
    }

    public circle1(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius = " + radius);
    }
}

public class Circle {
    public static void main(String[] args) {

    	circle1 c1 = new circle1();    
        c1.display();

        circle1 c2 = new circle1(5.5);     
        c2.display();
    }
}
