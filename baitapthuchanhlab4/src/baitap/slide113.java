package baitap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class slide113 {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String fruit;
        do {
            System.out.print("Nhap ten loai trai cay ('khong nhap gi' de stop)): ");
            fruit = sc.nextLine();
            if (!fruit.isEmpty()) {
                fruitSet.add(fruit);
            }
        } while (!fruit.isEmpty());

        System.out.println("So phan tu co trong Hashset: " + fruitSet.size());

        System.out.print("Nhap ten loai trai cay de kiem tra: ");
        String searchFruit = sc.nextLine();
        if (fruitSet.contains(searchFruit)) {
            System.out.println("Da tim thay loai trai cay nay trong HashSet!");
        
        } else {
            System.out.println("Khong tim thay loai trai cay nay trong HashSet!");
        }

        System.out.print("Nhap ten loai trai cay de xoa ");
        String removeFruit = sc.nextLine();
        fruitSet.remove(removeFruit);

        // Hiển thị các phần tử còn lại trong HashSet
        System.out.println("Cac phan tu con lai trong HashSet");
        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Buoi");
        fruitList.add("Xoai");
        fruitList.add("Cam");
        fruitList.add("Chuoi");

        fruitSet.addAll(fruitList);
        System.out.println("HashSet sau khi thay the phan tu tu List:");
        iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fruitSet.removeAll(fruitList);
        System.out.println("HashSet sau khi xoa cac phan tu cua List:");
        iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
    }
}