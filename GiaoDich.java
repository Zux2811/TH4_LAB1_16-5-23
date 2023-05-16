

public abstract class GiaoDich{
    protected String MaGiaoDich;
    protected NgayThangNam NTNGiaoDich;
    protected double DonGia;
    protected double DienTich;
    public String getMaGiaoDich() {
        return MaGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        MaGiaoDich = maGiaoDich;
    }
    public NgayThangNam getNTNGiaoDich() {
        return NTNGiaoDich;
    }
    public void setNTNGiaoDich(NgayThangNam nTNGiaoDich) {
        NTNGiaoDich = nTNGiaoDich;
    }
    public double getDonGia() {
        return DonGia;
    }
    public void setDonGia(double donGia) {
        DonGia = donGia;
    }
    public double getDienTich() {
        return DienTich;
    }
    public void setDienTich(double dienTich) {
        DienTich = dienTich;
    }
    public GiaoDich(String maGiaoDich, NgayThangNam nTNGiaoDich, double donGia, double dienTich) {
        MaGiaoDich = maGiaoDich;
        NTNGiaoDich = nTNGiaoDich;
        DonGia = donGia;
        DienTich = dienTich;
    }
    public abstract double tinhThanhTien();


}