import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich {
	private List<GiaoDich> danhSachGiaoDich;
	
	public QuanLyGiaoDich() {
		danhSachGiaoDich = new ArrayList<>();
	}
	
	public void themGiaoDich(GiaoDich giaoDich) {
		danhSachGiaoDich.add(giaoDich);
	}
	public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.println("Mã giao dịch: " + giaoDich.MaGiaoDich);
            System.out.println("Ngày giao dịch: " + giaoDich.NTNGiaoDich.toString());
            System.out.println("Đơn giá: " + giaoDich.DonGia);
            System.out.println("Diện tích: " + giaoDich.DienTich);
            System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
            System.out.println("-------------------------");
        }
    }
	public double tinhTrungBinhThanhTienGiaoDichDat() {
        double tongThanhTien = 0;
        int soLuongGiaoDich = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                tongThanhTien += giaoDich.tinhThanhTien();
                soLuongGiaoDich++;
            }
        }

        if (soLuongGiaoDich > 0) {
            return tongThanhTien / soLuongGiaoDich;
        } else {
            return 0;
        }
    }

    public void xuatGiaoDichThangNam(int thang, int nam) {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            NgayThangNam ngayThang = giaoDich.NTNGiaoDich;
            if (ngayThang.getThang() == thang && ngayThang.getNam() == nam) {
                System.out.println("Mã giao dịch: " + giaoDich.MaGiaoDich);
                System.out.println("Ngày giao dịch: " + giaoDich.NTNGiaoDich.toString());
                System.out.println("Đơn giá: " + giaoDich.DonGia);
                System.out.println("Diện tích: " + giaoDich.DienTich);
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println("-------------------------");
            }
        }
    }

}