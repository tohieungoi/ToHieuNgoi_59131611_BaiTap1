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
public class GiaoVien extends CaNhan{
    private String monDay,toBoMon;
    public GiaoVien()
    {
        super();
        this.monDay="";
        this.toBoMon="";
    }
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt,String monDay,String toBoMon)
    {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay=monDay;
        this.toBoMon=toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
      return "Ho Ten: "+ this.hoTen
               +"\n tuoi"+this.tuoi
               +"\n Dia Chi"+this.diaChi
               +"\n sdt"+this.sdt
               +"\n lop"+this.monDay
               +"\n Nang Khieu"+this.toBoMon;
               }
    }

