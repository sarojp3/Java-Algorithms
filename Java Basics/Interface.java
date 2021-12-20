//Interface is a complete abstract class(i.e. we cannot create object of that class).
//It is used to group number of methods(functions) without their bodies.

interface A{
    public void showA(); //Interface methods without bodies
    public void sleep();
}

class B implements A{
    public void showA() {
        System.out.println("This is interface A");
    }
    public void sleep(){
        System.out.println("Sleeping...Zzzz!!");
    }
}

interface firstInterface{
    public void myMethod();
}

interface secondInterface{
    public void myOtherMethod();
}
class MultipleInterface implements firstInterface, secondInterface{
    public void myMethod(){
        System.out.println("This is my first interface");
    }
    public void myOtherMethod(){
        System.out.println("This is my second interface");
    }
}

public class Interface {
    public static void main(String[] args){
        B myObj = new B();
        MultipleInterface myInterfaces = new MultipleInterface();
        myObj.showA();
        myObj.sleep();
        myInterfaces.myMethod();
        myInterfaces.myOtherMethod();
    }
}
