public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich();

        // Thêm các giao dịch vào danh sách
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD001", new NgayThangNam(3, 9, 2013), 2000, 150, "cao cap", "178/15 PhamVanBach"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD002", new NgayThangNam(4, 9, 2013), 3000, 200, "thuong", "2/11 BachDang"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD003", new NgayThangNam(5, 9, 2013), 60000, 1000, "thuong", "45/7 TanDinh"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD004", new NgayThangNam(8, 9, 2013), 80000, 1500, "cao cap", "12/3 TanSon"));

        // Xuất danh sách giao dịch
        System.out.println("Danh sách các giao dịch:");
        quanLyGiaoDich.xuatDanhSachGiaoDich();

        // Tính trung bình thành tiền của giao dịch đất
        double trungBinhThanhTien = quanLyGiaoDich.tinhTrungBinhThanhTienGiaoDichDat();
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTien);

        // Xuất các giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch của tháng 9 năm 2013:");
        quanLyGiaoDich.xuatGiaoDichThangNam(9, 2013);
    }
}