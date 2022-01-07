class Super{
    void meth1(){
        System.out.println("This is the method 1");
    }
    void meth2(){
        System.out.println("This is the method 2");
    }
}
class Sub extends Super{
    @Override
    void meth2(){
        System.out.println("This is the overridden method 2");
    }
    void meth3(){
        System.out.println("This is the method 3");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.meth2();
    }
}
