package level2;

class Students {
	String name;
	int rollNo;
	float totalMark;
	
	Students(String n,int r,float m){
		name=n;
		rollNo=r;
		totalMark=m;
	}
	String calculate() {
		if (totalMark >= 90) {
            return "A";
        } else if (totalMark >= 75) {
            return "B";
        } else if (totalMark >= 50) {
            return "C";
        } else if (totalMark >= 35) {
            return "D";
        } else {
            return "F";
        }
    }
	void display() {
          System.out.println(" The name is "+ name);
          System.out.println(" The Roll no is "+ rollNo);
          System.out.println(" Total Mark is "+ totalMark);
          System.out.println(" result is : "+ calculate());


		}
	
}
public class Studentss {
public static void main(String[] args) {
	Students s1=new Students("maha",30,55);
	s1.display();
}
}