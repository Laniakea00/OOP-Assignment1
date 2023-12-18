package Assignment1.Matrix;

public class Matrix {
    private double[][] array;
    private int rows, columns;

    public Matrix(double[][] array) {
        this.array = array;
        this.rows = array.length;
        this.columns = array[0].length;
    }

    public Matrix add(Matrix other) {
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.array[i][j] + other.array[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(double n) {
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.array[i][j] * n;
            }
        }
        return new Matrix(result);
    }

    public void printout() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
