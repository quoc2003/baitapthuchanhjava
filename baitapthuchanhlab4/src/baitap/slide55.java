package baitapthuchanhlab4.src.baitap;

public class slide55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add("Quoc");
        hashSet.add("Nguyen");
        hashSet.add("Tuan");
        hashSet.add("Trung");
        hashSet.add("Vu");

        System.out.println("Cac phan tu trong hashSet : ");
        System.out.println(hashSet);
        System.out.println("Nhap phan tu can xoa");
        name = sc.nextLine();
        
        if(hashSet.contains(name)) {
            hashSet.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSet: ");
            System.out.println(hashSet);
        } else {
            System.out.println("xoa khong thanh cong!");
        }
    }
}
