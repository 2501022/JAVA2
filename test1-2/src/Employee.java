public abstract class Employee {
    protected String employeeID;
    protected String name;
    protected String birthday;

    public Employee(String employeeID, String name, String birthday) {
        this.employeeID = employeeID;
        this.name = name;
        this.birthday = birthday;
    }

    public abstract double getPay();

    public double getTax() {
        double pay = getPay();

        if(this instanceof Temporary)
            return pay * 0.066;

        if(pay <= 2000000)
            return pay * 0.066;
        else if(pay <= 4000000)
            return pay * 0.073;
        else
            return pay * 0.085;
    }
}