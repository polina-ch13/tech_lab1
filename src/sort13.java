import javax.annotation.processing.SupportedSourceVersion;

public class sort13 {

    private int M, N;
    private double a [][]; // матрица

    // конструктор
    sort13 (double a[][]) {
        this.a = a;
        M = a.length;
        N = a[0].length;
    }

    public double[][] sort(double K) {
        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N - 1; j++)
                    for (int k = 0; k < N - j - 1; k++) {
                        if (a[i][k] < a[i][k+1]) {
                            double temp = a[i][k];
                            a[i][k] = a[i][k+1];
                            a[i][k+1] = temp;
                        }
                    }
            } else
            if (i % 2 == 1) {
                for (int j = 0; j < N - 1; j++)
                    for (int k = 0; k < N - j - 1; k++) {
                        if (a[i][k] > a[i][k+1]) {
                            double temp = a[i][k];
                            a[i][k] = a[i][k+1];
                            a[i][k+1] = temp;
                        }
                    }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] < K)
                    a[i][j] *= K;
            }
        }
        return a;
    }
}
