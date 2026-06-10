public class Manager extends Regular {

    public Manager(String id, String name, String birth,
                   int grade, int step) {

        super(id,name,birth,grade,step);
    }

    @Override
    public double getPay() {

        double base = super.getPay();

        if(base <= 1800000)
            return base * 1.06;
        else if(base <= 2400000)
            return base * 1.05;
        else
            return base * 1.04;
    }
}