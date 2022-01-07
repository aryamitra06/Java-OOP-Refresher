interface Book{
    void pageNo();
    void color();
}
interface Mathbook extends Book{
    void sums();
    void cover();
}

class mcgrawHill implements Mathbook{
    public void pageNo(){
        System.out.println("Total pages are 2022.");
    }
    public void color(){
        System.out.println("Color of the book is red.");
    }
    public void sums(){
        System.out.println("Total no. of sums are 678.");
    }
    public void cover(){
        System.out.println("The book is hardcover.");
    }
}

public class interfaceinheritance {
 public static void main(String[] args) {
     mcgrawHill newbook = new mcgrawHill();
     newbook.color();
     newbook.sums();
 }   
}
