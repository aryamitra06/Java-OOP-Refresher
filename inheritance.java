class Animal{
    void Walk()
    {
        System.out.println("Walking...");
    }
    void Run()
    {
        System.out.println("Running...");
    }
}
class Dog extends Animal{
    void Bark()
    {
        System.out.println("Barking...");
    }
}

public class inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.Bark();
        d.Run();

        Animal a = new Animal();
        a.Run();
        // a.Bark(); -> Not possible
    }
}
