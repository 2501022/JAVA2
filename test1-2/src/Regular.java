public class Regular extends Employee {

    protected int grade;
    protected int step;

    public Regular(String id, String name, String birth,
                   int grade, int step) {
        super(id, name, birth);
        this.grade = grade;
        this.step = step;
    }

    @Override
    public double getPay() {

        int[][] salary = {
                {2600000,2800000,3100000,3400000,3800000},
                {2650000,2860000,3170000,3480000,3890000},
                {2700000,2920000,3240000,3560000,3980000},
                {2750000,2980000,3310000,3640000,4070000},
                {2800000,3040000,3380000,3720000,4160000}
        };

        return salary[step-1][grade-1];
    }
}