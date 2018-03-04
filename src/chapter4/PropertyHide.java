package chapter4;

class X {
    double y=11.456789;
    public void f() {
        y=y+1;
        System.out.printf("y是double型的变量，y=%f\n",y);
    }
}
class Y extends X {
    int y=0;
    public void g() {
        y=y+100;
        System.out.println("y是int型的变量，y="+y);
    }
}
public class PropertyHide {
    public static void main(String args[]) {
        Y b = new Y();
        b.y = 200;
        b.g();
        b.f();
    }
}

