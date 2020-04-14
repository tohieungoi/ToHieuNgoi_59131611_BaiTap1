/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tohieungoi_59131611_lophoc;

/**
 *
 * @author tohie
 */
public abstract class CaNhan {

    String hoTen;
    String diaChi;
    String sdt;
    int tuoi;
    
    public CaNhan()
    {
        this.hoTen="";
        this.tuoi=0;
        this.diaChi="";
        this.sdt="";
    }
    public CaNhan(String hoTen,int tuoi,String diaChi,String sdt)
    {
        this.hoTen=hoTen;
        this.tuoi=tuoi;
        this.diaChi=diaChi;
        this.sdt=sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public abstract String HienThiTT();
}
