public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new Regular("100001","김형준","2000-01-01",1,1),
                new Salesman("100002","김철수","2000-02-01",
                        2,3,10000000,0.03),
                new Manager("100003","이영희","2000-03-01",
                        3,2),
                new Temporary("100004","박민수","2000-04-01",
                        80000,20),
                new Contract("100005","최지훈","2000-05-01")
        };

        for(Employee emp : employees){

            System.out.println("사번 : " + emp.employeeID);
            System.out.println("이름 : " + emp.name);
            System.out.println("급여 : " + emp.getPay());
            System.out.println("세금 : " + emp.getTax());

            System.out.println("--------------------");
        }
    }
}