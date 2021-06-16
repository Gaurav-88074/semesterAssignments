/*
An abstract class has a construtor which prints "This is constructor of abstract class", an abstract
method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract
class". A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This
is abstract method". Now create an object of 'SubClass' and call the abstract method and the non-abstract
method. (Analyse the result)
*/
abstract class Abstract{
    public Abstract(){
        System.out.println("This is constructor of abstract class");
    }
    public abstract void a_method();
    public void b_method(){
        System.out.println("This is a normal method of abstract class");
    }

}
class SubClass extends Abstract{
    public void a_method(){
        System.out.println("This is abstract method");
    }
}
public class Q4 {
    public static void main(String[] args) {
        SubClass object = new SubClass();
        object.a_method();
        object.b_method();
    }
    
}
