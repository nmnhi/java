import java.util.Calendar;
import java.util.Scanner;

public class bai22_vi_du_van_dung {
    public static void main(String[] args) {
        // Viet chuong trinh nhap vao ngay thang nam sinh cho biet so tuoi va in ra man hinh

        int day, month, year, tuoi;
        //nhap du lieu tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap ngay sinh");
        day = input.nextInt();
        System.out.println("Moi nhap thang sinh");
        month = input.nextInt();
        System.out.println("Moi nhap nam sinh");
        year = input.nextInt();
        // khoi tao calendar
        Calendar birthday = Calendar.getInstance();
        // set ngay thang nam sinh duoc nhap vao
        birthday.set(year, month - 1, day);
        //xuat ngay thang nam sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam sinh: "
                + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);
        // tinh tuoi
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;
        System.out.println("Tuoi cua ban la: " + tuoi);
    }
}
