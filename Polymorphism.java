public class Polymorphism {
    public static void main(String[] args) {
        Add a=new Add();
        System.out.println(a.ad(2,3,4 ));
        Dog d=new Dog();
        d.run();
        
    }
}
//method overloading
    
class Add{
    int add(int a,int b){
        return a-b;

    }
    int add(int a ){
        return a*a;
    }
    int ad(int a,int b,int c){
        return a+b+c;
    }
}
//method overrinding
class Animal{
    void run(){
        System.out.println("Animal is eating");
    } 
}
class Dog extends Animal{
    void run(){
        System.out.println("Dog is running");
    }
}