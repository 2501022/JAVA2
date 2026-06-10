public class Temporary extends Employee {

    private int dailyPay;
    private int workDays;

    public Temporary(String id, String name, String birth,
                     int dailyPay, int workDays) {

        super(id,name,birth);

        this.dailyPay = dailyPay;
        this.workDays = workDays;
    }

    @Override
    public double getPay() {
        return dailyPay * workDays;
    }
}