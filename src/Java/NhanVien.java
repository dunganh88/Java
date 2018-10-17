package Java;


public class NhanVien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	public double LUONG_MAX;
	
	public NhanVien(String tenNhanVien , double luongCoBan , double heSoLuong) {
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getLUONG_MAX() {
		return LUONG_MAX;
	}
	public void setLUONG_MAX(double lUONG_MAX) {
		LUONG_MAX = lUONG_MAX;
	}
	public boolean tangLuong(double n) {
		this.heSoLuong += n;
		double luong = this.tinhLuong();
		if(luong > this.LUONG_MAX) {
			this.heSoLuong -= n;
			System.out.println("Nhieu hon luong toi da cho phep");
			return false;
		}else 
			return true;
	}
	 
	public double tinhLuong() {
		return luongCoBan*heSoLuong;
	}
	
	void inTTin() {
		System.out.println("Ten : " + tenNhanVien + "\nLuong Co Ban : " + luongCoBan + "\nHe So Luong :" + heSoLuong );
	}

	public static void main(String[] args) {
		NhanVien p1 = new NhanVien("AB", 100000 , 1.7 );
		p1.setHeSoLuong(1.9);
	}
	
}
