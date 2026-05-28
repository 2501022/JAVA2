class TempEmp extends Emp {
    int daily;
    int days;

    public TempEmp(int id, String name, String hireDate, int daily, int days) {
        super(id, name, hireDate);
        this.daily = daily;
        this.days = days;
    }

    @Override
    int getPay() {
        return daily * days;
    }
}