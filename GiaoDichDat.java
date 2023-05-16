public class GiaoDichDat extends GiaoDich {
    private static final int DienTich = 0;
    private static final int DonGia = 0;

    public GiaoDichDat(String maGiaoDich, NgayThangNam nTNGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, nTNGiaoDich, donGia, dienTich);
        //TODO Auto-generated constructor stub
    }
    private String LoaiDat;
    
    public double tinhThanhTien(){
        double thanhTien;
        if(LoaiDat.equalsIgnoreCase("A")){
            return thanhTien= DienTich*DonGia*1.5;   
        }else
        return DienTich*DonGia;
    }
}


