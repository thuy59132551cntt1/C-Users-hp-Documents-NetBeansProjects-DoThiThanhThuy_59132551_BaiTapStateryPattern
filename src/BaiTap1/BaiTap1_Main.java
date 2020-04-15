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
public class BaiTap1_Main {
    public static void main(String[] args) {
        context ct1 = new context();
        
        ct1.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ct1.tinh(75, 12));
        
        ct1.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ct1.tinh(54, 78));
        
    }
    
}
