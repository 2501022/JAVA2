abstract class Emp {
    int id;
    String name;
    String hireDate;

    public Emp(int id, String name, String hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }

    abstract int getPay();

    int getTax(int pay) {
        double rate = 0;

        if (pay < 2000000) rate = 0.045;
        else if (pay < 4000000) rate = 0.084;
        else if (pay < 6000000) rate = 0.106;
        else rate = 0.123;

        return (int)(pay * rate);
    }
}