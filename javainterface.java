interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    public void applyBrake(int decrement)
    {
        System.out.println("Applying brake...");
    }
    public void speedUp(int increment)
    {
        System.out.println("Applying brake...");
    }
}
public class javainterface {
    public static void main(String[] args) {
        AvonCycle newcycle = new AvonCycle();
        newcycle.applyBrake(5);
    }
}
