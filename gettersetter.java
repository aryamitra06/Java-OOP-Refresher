class Employee
{
    private int id;
    private String name;

void setName(String n){
    name = n;
}    

void setId(int i){
    id = i;
}

int getId()
{
    return id;
}

String getName()
{
    return name;
}
}


public class gettersetter {
   public static void main(String[] args) {
       Employee Aryamitra = new Employee();
       Aryamitra.setId(11);
       System.out.println("ID is " +Aryamitra.getId());
   } 
}
