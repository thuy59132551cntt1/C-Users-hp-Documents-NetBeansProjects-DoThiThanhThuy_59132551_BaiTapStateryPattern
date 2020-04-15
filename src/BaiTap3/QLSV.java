/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVienN> dssv = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void themSV(SinhVienN sv){
        dssv.add(sv);
    }
    
    private void swap(SinhVienN sv1, SinhVienN sv2) {
        SinhVien SV = sv1.sv;
        sv1.sv = sv2.sv;
        sv2.sv = SV;
    }
    
    public void sapXep(){
        for (int i=0; i<dssv.size()-1; i++){
            for (int j=i+1; j<dssv.size(); j++){
                if(soSanh.SoSanh(dssv.get(i).sv,dssv.get(j).sv)==1){
                   
                    swap(dssv.get(i),dssv.get(j));
                    
                }
                
            }
        }
    }

    public void inDS(){
        for (int i=0; i<dssv.size(); i++){
            System.out.println("Sinh viên thứ " + (i+1));
            dssv.get(i).sv.hienThi();
        }
    }
    
}
