
class Employee{

  String name;
  int age;
  String designation;
  double salary;

    public static void main(String[] args) {
    
        Employee emp1 = new Employee();
        // classname objectname = new classname();

      String  name = emp1.name = "joy";
      int age =  emp1.age = 25;
      String designation =  emp1.designation = "Software Engineer";
      double salary = emp1.salary = 10000.0;

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);

        
    
    }

    


}