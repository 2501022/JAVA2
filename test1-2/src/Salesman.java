public class Salesman extends Regular {

    private double sale;
    private double commission;

    public Salesman(String id, String name, String birth,
                    int grade, int step,
                    double sale, double commission) {

        super(id,name,birth,grade,step);

        this.sale = sale;
        this.commission = commission;
    }

    @Override
    public double getPay() {
        return super.getPay() + sale * commission;
    }
}