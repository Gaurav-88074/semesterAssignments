abstract class parent {

    public abstract void message();
}
class firstChild extends parent{
    public void message(){
        System.out.println("This is first SubClass");
    }
}
class secondChild extends parent{
    public void message(){
        System.out.println("This is second SubClass");
    }
}
public class Q3{
    public static void main(String[] args) {
        
        parent FirstSubClass = new firstChild();
        parent SecondSubClass = new secondChild();
        FirstSubClass.message();
        SecondSubClass.message();
    }
}