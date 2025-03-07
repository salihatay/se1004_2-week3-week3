public class Main {
    public static void main(String[] args) {
        int length_of_args = args.length;

        if (length_of_args == 0) {
            System.out.println("You should give a score");
        } else {
            int grade = Integer.parseInt(args[0]);

            if (grade >= 90) {
                System.out.println("Grade: A");
            } else if (grade <= 89 && grade > 80) {
                System.out.println("Grade: B");
            } else if (grade <= 79 && grade > 70) {
                System.out.println("Grade: C");
            } else if (grade <= 69 && grade > 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}

