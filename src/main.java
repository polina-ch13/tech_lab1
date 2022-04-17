import java.util.Scanner;

public class main {

    public static Scanner sc = new Scanner(System.in);

    // записать матрицу
    public static void readMatr(double a[][]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите строку " + (i+1) + "(" + a[i].length + " эл.):");
            for (int j = 0; j < a[i].length; j++) {
                while (!sc.hasNextDouble()) {
                    System.out.println("Некоректний ввод");
                    sc.next();
                }
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println();
    }

    // вывод матрицы
    public static void printMatr(double a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String [] args) {
        int M = 0;
        int N = 0;
        do {
            System.out.println("Размер матрицы - положительные разные числа:");
            M = sc.nextInt();
            N = sc.nextInt();
        } while ((N <=0 || M <= 0) || (M == N));

        double [][] a = new double[M][N];
        readMatr(a);
        printMatr(a);

        double k;
        while (!sc.hasNextDouble()) {
            System.out.println("Некоректний ввод");
            sc.next();
        }
        k = sc.nextDouble();

        sort13 s13 = new sort13(a);
        a = s13.sort(k);
        printMatr(a);
    }
}
