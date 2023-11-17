import java.util.Scanner;

public class XeBuyt {
    public static class TuyenXe {
        private String ma;
        private String ten;
        private String ngay;
        private int doanhThu;
        private int soHieuTuyen;
        private int soLuot;

        private String kieuNgay;

        public TuyenXe(String ten, String ngay, int soHieuTuyen, int soLuot, String kieuNgay) {
            this.ten = ten;
            this.ngay = ngay;
            this.soHieuTuyen = soHieuTuyen;
            this.soLuot = soLuot;
            this.kieuNgay = kieuNgay;
        }

        public void calc() {
            if (this.soLuot < 5)
                this.doanhThu = this.soLuot * 800;
            if (this.soLuot >= 5 && this.soLuot <= 10)
                this.doanhThu = this.soLuot * 780;
            if (this.soLuot >= 10)
                this.doanhThu = this.soLuot * 750;

            if (this.kieuNgay == "nghi")
                this.doanhThu = this.doanhThu * 110 / 100;
            if (this.kieuNgay == "le")
                this.doanhThu = this.doanhThu * 120 / 100;
        }

        @Override
        public String toString() {
            return this.soHieuTuyen + " " + this.ten + " " + this.ngay + " " + this.soLuot + " " + this.kieuNgay + " "
                    + this.doanhThu;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String a, b, c;
            int d, e;
            a = in.nextLine();
            b = in.nextLine();
            d = Integer.parseInt(in.nextLine());
            e = Integer.parseInt(in.nextLine());
            c = in.nextLine();
            TuyenXe bus = new TuyenXe(a, b, d, e, c);
            bus.calc();
            System.out.println(bus);
        }
    }
}