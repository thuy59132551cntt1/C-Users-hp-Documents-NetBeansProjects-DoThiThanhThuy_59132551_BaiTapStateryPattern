/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author hp
 */
public class BaiTap2_Main {
    public static void main(String[] args) {
       GioHang GH1 = new GioHang();
       GioHang GH2 = new GioHang();
       
       GH1.setHinhThucTT(new ThanhToanOnline());
       GH2.setHinhThucTT(new ThanhToanCOD());
       
       HangHoa HH1 = new HangHoa("Mì Tôm",30000,"Đây là Mì Tôm");
       HangHoa HH2 = new HangHoa("Trứng gà",110000,"Đây là Trứng gà");
       HangHoa HH3 = new HangHoa("Thịt heo",500000,"Đây là Thịt heo");
       HangHoa HH4 = new HangHoa("Xúc xích",300000,"Đây là Xúc xích");
       
       GH1.themHangHoa(HH1);
       GH1.themHangHoa(HH2);
       GH1.themHangHoa(HH3);
       GH1.themHangHoa(HH4);
       
       GH2.themHangHoa(HH1);
       GH2.themHangHoa(HH2);
       GH2.themHangHoa(HH3);
       GH2.themHangHoa(HH4);
       
       System.out.println("\nDanh sách hàng hóa của giỏ hàng 1(online)");
       GH1.hienthi();
       System.out.println("Giỏ hàng 1: tổng tiền hàng: " + GH1.tinhTienHang() + " Tiền khách trả: "+GH1.tinhTienKhachTra());

       System.out.println("\nDanh sách hàng hóa của giỏ hàng 2(COD)");
       GH2.hienthi();
       System.out.println("Giỏ hàng 2: tổng tiền hàng: " + GH2.tinhTienHang() + " Tiền khách trả: "+GH2.tinhTienKhachTra());
    }
    
}
