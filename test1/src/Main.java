import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Emp> list = new ArrayList<>();

        // 일용직
        System.out.print("[일용직] 이름: ");
        String name = sc.next();
        System.out.print("일당: ");
        int daily = sc.nextInt();
        System.out.print("일수: ");
        int days = sc.nextInt();

        list.add(new TempEmp(1, name, "2026", daily, days));

        // 계약직
        System.out.print("[계약직] 이름: ");
        name = sc.next();
        list.add(new ContEmp(2, name, "2026"));

        sc.nextLine(); // 버퍼 정리

        // 정규직
        System.out.print("[정규직] 이름: ");
        name = sc.nextLine();

        System.out.print("직급(1~8): ");
        int grade = sc.nextInt();

        // 직급 검사
        if (grade < 1 || grade > 8) {
            System.out.println("잘못된 직급입니다.");
            return;
        }

        if (grade == 8) {
            list.add(new ResearchEmp(4, name, "2026"));
        }
        else if (grade <= 2) {
            System.out.print("성과 수당: ");
            int perf = sc.nextInt();
            System.out.print("스톡옵션: ");
            int stock = sc.nextInt();

            list.add(new RegEmp(3, name, "2026", grade, perf, stock));
        }
        else {
            System.out.print("호봉(0~7): ");
            int step = sc.nextInt();

            if (step < 0 || step > 7) {
                System.out.println("잘못된 호봉입니다.");
                return;
            }

            list.add(new RegEmp(3, name, "2026", grade, step));
        }

        // 정렬
        list.sort((a, b) -> {
            int g1 = (a instanceof RegEmp) ? ((RegEmp)a).grade :
                    (a instanceof ResearchEmp) ? 8 : 10;

            int g2 = (b instanceof RegEmp) ? ((RegEmp)b).grade :
                    (b instanceof ResearchEmp) ? 8 : 10;

            return g1 - g2;
        });

        // 결과 출력
        System.out.println("\n===== 결과 =====");

        for (Emp e : list) {
            int pay = e.getPay();
            int tax = e.getTax(pay);
            int result = pay - tax;

            System.out.println(e.name + " | 급여: " + pay + " | 세금: " + tax + " | 실수령: " + result);
        }
    }
}