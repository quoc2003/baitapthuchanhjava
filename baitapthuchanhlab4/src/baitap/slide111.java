package baitap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList< Integer> linkeList= new LinkedList<>();
        System.out.println("nhap vao so phan tu:");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            System.out.printf("nhap vao phan tu thu %d:", i+1);
            int phantu = sc.nextInt();
            linkeList.add(phantu);
        }
        int sum = 0;
        int dem = 0;
        for (int il = 0; il < linkeList.size(); il++) {
            if ( linkeList.get(il) % 2 == 0) {
                dem++;
                sum += linkeList.get(il);
            }

        }
        System.out.printf("trung binh cong cua cac so chan la : %.2f", (float) sum / dem);
    }
    
}
