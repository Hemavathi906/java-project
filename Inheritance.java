class Inheritance{
    public static void main(String [] args){
        System.out.println("main class");
        Dog d=new Dog();
        d.bark();
        d.run();
        Multiply m=new Multiply();
        m.add();
        m.sub();
        m.mul();
        Cat c=new Cat();
        c.display();
        c.meow();
        }
}
//singlelevelinheritance
class Animal{
    void run(){
        System.out.println("running");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
//multilevelinheritance
class Add{
    void add(){
        System.out.println("This is add method");
    }

}
class Sub extends Add{
    void sub(){
        System.out.println("This is sub method");
    }
}
class Multiply extends Sub{
    void mul(){

        System.out.println("This is multiply");
    }
}

//hierarchical inheritance
class Super{
void display(){
    System.out.println("Super class");
}
}
class Man extends Super{
    void walk(){
        System.out.println("walking");
    }
}
class Cat extends Super{
    void meow(){
        System.out.println("meowing");
    }
}
