class ResearchEmp extends Emp {

    public ResearchEmp(int id, String name, String hireDate) {
        super(id, name, hireDate);
    }

    @Override
    int getPay() {
        int base = 4500000;
        int bonus = (int)(base * 0.3); // 연구수당 30%

        return base + bonus;
    }

    @Override
    int getTax(int pay) {
        int base = 4500000;
        int bonus = (int)(base * 0.3);

        // 🔥 연구수당은 비과세 → 기본급만 과세
        return super.getTax(base);
    }
}