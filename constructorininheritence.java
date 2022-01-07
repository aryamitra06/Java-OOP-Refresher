class parent{
    int a = 3;
    parent(){
        System.out.println("Constructor inside the parent class. " +a);
    }
}
class child extends parent{
    int b = 9;
    child(){
        System.out.println("Constructor inside the child class. " +b);
    }
}
class childchild extends child{
    childchild(int c){
        System.out.println("Constructor inside the childchild class " +c);
    }
}
public class constructorininheritence {
    public static void main(String[] args) {
    }
}
