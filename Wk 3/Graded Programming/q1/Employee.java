class Employee extends Person{
    private double salary;

    //implement the constructor
    public Employee(String nm1, long adh1, double sal)
    {
        super(nm1, adh1);
        this.salary = sal;
    }

    //override print method 
     public void print() {
        super.print();
        System.out.println("salary : " + this.salary);
    }
}