import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
       //Viết chương trình tính số tiền điện (in kết quả ra console)
        //Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau: - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000 - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dien can tinh tien: ");
        int dien = sc.nextInt();
        if (dien <= 100){
            System.out.println("Tien dien la: "+ dien*1000);
        }
        else {
            System.out.println("Tien dien la: "+ (100*1000+((dien-100)*100)));
        }
    }
}
