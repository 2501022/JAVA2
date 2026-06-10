public class Contract extends Employee {

    public Contract(String id, String name, String birth) {
        super(id,name,birth);
    }

    @Override
    public double getPay() {
        return 2000000;
    }
}