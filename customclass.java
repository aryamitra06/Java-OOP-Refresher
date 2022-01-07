class Employee
{
    int id;
    String name;

    void printDetails()
    {
        System.out.println("Name is " +name+ " and id is " +id);
    }
}

// only one public class possible in a java program
public class customclass{
    public static void main(String[] args) {

        // creating new object
        Employee Aryamitra = new Employee();

        // setting attributes
        Aryamitra.id = 5;
        Aryamitra.name = "Aryamitra Chaudhuri";

        //using method to print details
        Aryamitra.printDetails();
    }
}