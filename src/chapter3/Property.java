package chapter3;

class Circle {
    static double pi;  //类变量
    double radius;   //实例变量
}
public class Property{
	public static void main(String[] args) {
		Circle.pi=3;
		Circle circle1=new Circle();
		circle1.radius=10;
		Circle circle2=new Circle();
		circle2.radius=100;
	}
}
