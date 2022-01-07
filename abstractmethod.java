abstract class Phone{
abstract void on();
}

class Smartphone extends Phone{
@Override
    void on(){
        System.out.println("Turning on the phone...");
    }
}

public class abstractmethod {
public static void main(String[] args) {
    Smartphone obj = new Smartphone();
    obj.on();
}    
}
