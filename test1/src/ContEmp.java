class ContEmp extends Emp {

    public ContEmp(int id, String name, String hireDate) {
        super(id, name, hireDate);
    }

    @Override
    int getPay() {
        return 2000000;
    }
}