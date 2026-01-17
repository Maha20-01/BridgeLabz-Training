package level1;

class circle{
	float radius;
	
	
	circle(float r){
		radius=r;
	}
	
	float area() {
		return 3.14f * radius *radius;	
	}
	float circumference() {
		return 2*3.14f*radius;
	}
}
public class AreaOfCircle {
public static void main(String[] args) {
	
	circle c1=new circle(5);
	System.out.println("the area of circle is : "+c1.area());
	System.out.println("the circumference of circle is : "+c1.circumference());
	
	
}
}
