package Other;

import java.util.Scanner;



public class No25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            String a = sc.nextLine();
            String[] arr = a.split(" ");

            double credits = Double.parseDouble(arr[1]);
            String grade = arr[2];

            if (grade.equals("P")) {
                continue;
            }

            total += credits;

            switch (grade) {
                case "A+":
                    result += 4.5 * credits;
                    break;
                case "A0":
                    result += 4.0 * credits;
                    break;
                case "B+":
                    result += 3.5 * credits;
                    break;
                case "B0":
                    result += 3.0 * credits;
                    break;
                case "C+":
                    result += 2.5 * credits;
                    break;
                case "C0":
                    result += 2.0 * credits;
                    break;
                case "D+":
                    result += 1.5 * credits;
                    break;
                case "D0":
                    result += 1.0 * credits;
                    break;
            }
        }

        if (total == 0) {
            System.out.println("GPA를 계산할 수 없습니다.");
        } else {
            System.out.println(result / total);
        }
    }
}
