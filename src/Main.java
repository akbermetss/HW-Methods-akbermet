import java.util.Scanner;
public class Main {
    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score! Enter a score between 0 and 100.";
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void rightTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedRightTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Student Grader ===");
        System.out.print("Enter your score (0-100): ");
        int score = input.nextInt();

        System.out.println("Grade: " + calculateGrade(score));

        System.out.println("=== Number Pattern Generator ===");
        System.out.print("Enter the size of the pattern: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size! Enter a positive integer.");
        } else {
            System.out.println("Choose a pattern:");
            System.out.println("1. Right Triangle");
            System.out.println("2. Inverted Right Triangle");
            System.out.println("3. Pyramid");
            System.out.println("4. Inverted Pyramid");
            System.out.println("5. Number Triangle");

            System.out.print("Enter your choice (1-5): ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    rightTriangle(size);
                    break;
                case 2:
                    invertedRightTriangle(size);
                    break;
                case 3:
                    pyramid(size);
                    break;
                case 4:
                    invertedPyramid(size);
                    break;
                case 5:
                    numberTriangle(size);
                    break;
                default:
                    System.out.println("Invalid choice! Select a number from 1 to 5.");
            }
        }
        input.close();
    }
}