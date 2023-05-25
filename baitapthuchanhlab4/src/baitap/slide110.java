package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so cac phan tu cua day:");
        int n = scanner.nextInt();
        System.out.println("Nhap vao cac phan tu cua day:");
        for(int i = 0; i < n ; i++ ) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

     
        int max = Collections.max(numbers);
        System.out.println("So nguyen lon nhat trong day:" + max);

        System.out.print("Nhap vao so nguyen de xoa khoi day: ");
        int deleteNum = scanner.nextInt();

        numbers.removeIf(num -> num == deleteNum);

        Collections.sort(numbers);
        System.out.println("Say so sau khi sap xep:");
        for (int num : numbers) {
            System.out.print( num + " ");
        }
    }
}