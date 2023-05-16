public class GiaoDichNha extends GiaoDich {
    private String LoaiNha;
    private String DiaChi;
    public GiaoDichNha(String maGiaoDich, NgayThangNam nTNGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, nTNGiaoDich, donGia, dienTich);
        LoaiNha = loaiNha;
        DiaChi = diaChi;
    }
    public double tinhThanhTien(){
        double thanhTien;
        if(LoaiNha.equalsIgnoreCase("Cao Cap")){
            return thanhTien= DienTich*DonGia;   
        }else
        return thanhTien =DienTich * DonGia*0.9;
    }
    
    
}
