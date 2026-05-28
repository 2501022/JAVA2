class RegEmp extends Emp {
    int grade;
    int step;

    int perf = 0;
    int stock = 0;

    // 일반/관리직
    public RegEmp(int id, String name, String hireDate, int grade, int step) {
        super(id, name, hireDate);
        this.grade = grade;
        this.step = step;
    }

    // 임원
    public RegEmp(int id, String name, String hireDate, int grade, int perf, int stock) {
        super(id, name, hireDate);
        this.grade = grade;
        this.perf = perf;
        this.stock = stock;
    }

    @Override
    int getPay() {
        int base = 0;

        switch (grade) {
            case 7: base = 2123000; break;
            case 6: base = 2589000; break;
            case 5: base = 3235000; break;
            case 4: base = 3689000; break;
            case 3: base = 4589000; break;
            case 2: base = 5000000; break;
            case 1: base = 6000000; break;
        }

        int total = base;

        // 일반
        if (grade >= 5) {
            total += step * 100000;
        }
        // 관리직
        else if (grade >= 3) {
            total += step * 150000;

            int bonus = (int)(base * 0.1);
            bonus = (bonus / 1000) * 1000;
            total += bonus;
        }
        // 임원
        else {
            if (perf > 7000000) {
                System.out.println("ERROR : 7,000,000원 초과");
                perf = 7000000;
            }

            if (stock > 10000000) {
                System.out.println("ERROR : 10,000,000원 초과");
                stock = 10000000;
            }

            total = base + perf + stock;
        }

        return total;
    }
}