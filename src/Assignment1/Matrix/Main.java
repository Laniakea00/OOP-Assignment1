package Assignment1.Matrix;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] matrixData2 = {{7, 8, 9}, {10, 11, 12}};

        Matrix matrix1 = new Matrix(matrixData1);
        Matrix matrix2 = new Matrix(matrixData2);

        System.out.println("Assignment1.Matrix 1: ");
        matrix1.printout();

        System.out.println("Assignment1.Matrix 2: ");
        matrix2.printout();

        System.out.println("Assignment1.Matrix Sum (Assignment1.Matrix 1 + Assignment1.Matrix 2): ");
        Matrix sumMatrix = matrix1.add(matrix2);
        sumMatrix.printout();

        System.out.println("Assignment1.Matrix Multiply by: 2 ");
        Matrix scaledMatrix = matrix1.multiply(2);
        scaledMatrix.printout();
    }
}