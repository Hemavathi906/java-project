public class Abstract {
    public static void main(String[] args) {
        Bike b=new Pulsor();
        b.run();
        b.running();
    }
    
}
 abstract class Bike{
void run(){
    System.out.println("non abstract method");
}
abstract void running();
}
class Pulsor extends Bike{
    void running(){
        System.out.println("abstract method");
    }
}
