interface Camera{
    void takeSnap();
    void recordVideo();
}
abstract class Wifi{
    abstract void on();
}

class Mobile extends Wifi implements Camera{
    public void takeSnap()
    {
        System.out.println("Taking snap...");
    }
    public void recordVideo()
    {
        System.out.println("Taking video...");
    }
@Override    
    void on()
    {
        System.out.println("Connecting to the wifi...");
    }
}

public class abstractandinterface {
    public static void main(String[] args) {
        Mobile newmobile = new Mobile();
        newmobile.on();
        newmobile.takeSnap();
    }
}
