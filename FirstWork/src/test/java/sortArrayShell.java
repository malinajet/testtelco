package com.company;
import java.util.Scanner;
import java.util.Random;

public class sortArrayShell {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int  j, i, n, d, ch;

        System.out.print("Введите число элементов массива кратное двум,  n= ");
        n = sc.nextInt();

        int matrix[] = new int[n];

        System.out.print("Исходный массив:");

        Random Rand = new Random();

        for (i = 0; i < n; i++) {
            matrix[i] = Rand.nextInt(n);
            System.out.printf("%5d", matrix[i]);
        }

        d = n;
        d = d / 2;
        while (d > 0) {
            for (i = 1; i < n - d; i++) {
                j = i;
                while (j > 0 && matrix[j] > matrix[j + d]) {
                    ch = matrix[j];
                    matrix[j] = matrix[j + d];
                    matrix[j + d] = ch;
                    j--;
                }
            }
            d = d / 2;
        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.print("Отсортированный массив:");
        for (i = 1; i < n; i++) {
            System.out.printf("%3d", matrix[i]);
        }
    }


}
