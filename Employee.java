//Q5. Create a class named Employee with fields firstname,lastname,age and designation. 
// The class should: 
// 1. have all types of constructors to initialize the object 
// 2. class should also have setter methods to update a particular field 
// 3. Override its toString method to display a meaningful message using all these fields.

class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    // 1. Default constructor
    public Employee() {
        this.firstName = "Not Assigned";
        this.lastName = "Not Assigned";
        this.age = 0;
        this.designation = "Not Assigned";
    }

    // 2. Parameterized constructor
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    // 3. Copy constructor
    public Employee(Employee e) {
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.age = e.age;
        this.designation = e.designation;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Employee Details: " +
               "Name = " + firstName + " " + lastName +
               ", Age = " + age +
               ", Designation = " + designation;
    }
}

class TestEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Priyansh", "Awasthi", 21, "Software Engineer");
        Employee e3 = new Employee(e2);

        e1.setFirstName("Rahul");
        e1.setLastName("Sharma");
        e1.setAge(25);
        e1.setDesignation("Tester");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
