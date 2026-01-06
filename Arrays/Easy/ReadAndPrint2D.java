// Problem: Read and Print a 2D Array

import java.util.Scanner;
public class ReadAndPrint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\tFor a n x m Matrix.");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();      
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println();

        int[][] matrix = new int[n][m];
        System.out.print("Enter the values for the matrix: ");
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("The Matrix is:");
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
            System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
        }
        sc.close();
    }
}