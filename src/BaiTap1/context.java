/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author hp
 */
public class context {
Itinh tinhToan;
    public void setTinhToan(Itinh tinhToan){
       this.tinhToan = tinhToan;
    }
    
    public float tinh(float a, float b){
        return this.tinhToan.tinh(a, b);
    }
    
}
