package addontest;

public class rectangle {
public rectangle() {
	System.out.println("Area of the triangle is 1");
}
public rectangle(int a,int b) {
	int c = a*b;
	System.out.println("area of the rectangle is "+c);
}
public static void main(String[] args) {
	rectangle a = new rectangle(5,2);
	
 }
}
