class Employee{
    int id;
    String name;

    Employee()
    {
        id = 20;
        name = "Aryamitra";
    }

    // constructor overloading
    Employee(int pass)
    {
        id = 20;
        name = "[Protected] Aryamitra";
    }

    void Display(){
        System.out.println(name + id);
    }
}


public class constructor {
    public static void main(String[] args) {

        // Employee e = new Employee(123); -> using overloaded constructor
        Employee e = new Employee();
        e.Display();
    }
}
