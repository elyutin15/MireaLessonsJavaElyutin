package Task4_1.s4;

public class Matrix {
    private int[][] values;
    private int n;
    private int m;

    public Matrix(int[][] values, int n, int m) {
        this.values = values;
        this.n = n;
        this.m = m;
    }

    public Matrix sum(Matrix b) {
        if (b.getN() != n || b.getM() != m) {
            return null;
        }
        int[][] newValues = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                newValues[i][j] = b.getElement(i, j) + values[i][j];
            }
        }
        return new Matrix(newValues, n, m);
    }

    public void mul(int k) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                values[i][j] *= k;
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int getElement(int i, int j) {
        return values[i][j];
    }
}
