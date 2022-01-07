class A{
    void method1(){
        System.out.println("Hello World in method 1 class A");
    }
}
class B extends A{
    // method overriding
    void method1(){
        System.out.println("Hello World in method 1 class B");
    }
}
public class methodoverriding {
  public static void main(String[] args) {
      B a = new B();
      a.method1();
  }  
}
