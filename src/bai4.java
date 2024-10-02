import java.util.Scanner;

public class bai4 {
    //        Viết chương trình tổ chức menu:
//        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//        System.out.println("++ ----------------------------------------- ++");
//        System.out.println("| 1. Giải phương trình bậc nhất
//                System.out.println("| 2. Giải phương trình bậc hai
//                        System.out.println("| 3. Tính số tiền điện
//                                System.out.println("| 4. Kết thúc
//                                        System.out.println("++ ------------------ ++");
//        Yêu cầu: - Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên
//
    public static void main(String[] args) {
        System.out.println("LUA CHON TINH NANG");
        System.out.println("1. GIAI PHUONG TRNH BAC NHAT");
        System.out.println("2. GIAI PHUONG TRINH BAC HAI");
        System.out.println("3. TINH SO TIEN DIEN");
        System.out.println("4. KET THUC");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban (cac so tu 1-4): ");
        int luachon = sc.nextInt();
        switch (luachon) {
            case 1:
                System.out.println("GIAI PHUONG TRINH BAC NHAT ax+b=0");
                System.out.println("Nhap vao so nguyen a: ");
                int a = sc.nextInt();
                System.out.println("Nhap vao so nguyen b: ");
                int b = sc.nextInt();
                if (a == 0 && b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else if (a == 0 && b != 0) {
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    System.out.println("Phuong trinh co nghiem la:: " + (-b / (2 * a)));
                }
                break;
            case 2:
                System.out.println("GIAI PHUONG TRINH BAC HAI");
                System.out.println("Nhap vao so nguyen a: ");
                int a1 = sc.nextInt();
                System.out.println("Nhap vao so nguyen b: ");
                int b1 = sc.nextInt();
                System.out.println("Nhap vao so nguyen c: ");
                int c1 = sc.nextInt();
                if (a1 == 0) {
                    if (b1 == 0) {
                        System.out.println("Phuong trinh co vo so nghiem");
                    } else {
                        System.out.println("Phuong trinh vo nghiem");
                    }
                } else {
                    double delta = ((b1 ^ 2) - (4 * a1 * c1));
                    if (delta < 0) {
                        System.out.println("Phuong trinh vo nghiem");
                    } else if (delta == 0) {
                        System.out.println("Phuong trinh co nghiem kep la x = " + ((-b1 / (2 * a1))));
                    } else {
                        System.out.println("Phuong trinh co 2 nghiem rieng biet la");
                        double x1 = ((-b1 + Math.sqrt(delta)) / (2 * a1));
                        double x2 = ((-b1 - Math.sqrt(delta)) / (2 * a1));
                    }
                }
                break;
            case 3:
                System.out.println("TINH SO TIEN DIEN");
                System.out.println("Nhap vao so dien can tinh tien: ");
                int dien = sc.nextInt();
                if (dien <= 100) {
                    System.out.println("So tien dien da su dung la: " + (dien * 1000));
                } else {
                    System.out.println("So tien dien da su dung la:" + (100 * 1000 + (dien - 100) * 1500));
                }
                break;
            case 4:
                System.out.println("KET THUC");
                break;
            default:
                System.out.println("NHAP SAI YEU CAU");
        }
    }
}
