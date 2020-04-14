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
public class LopHoc {
    GiaoVien giaoVienCN = new GiaoVien();
    QLDS QLgiaoVienGD=new QLDS();
    QLDS QLhocSinh=new QLDS();
    
    public LopHoc(GiaoVien giaoVienCN)
    {
        this.giaoVienCN=giaoVienCN;
    }

    public GiaoVien getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setGiaoVienCN(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    public int themHocSinh(HocSinh hs)
    {
        if(QLhocSinh.them(hs)==1) return 1;
        return 0;
    }
    public int themGVGD(GiaoVien gv)
    {
        if(QLgiaoVienGD.them(gv)==1) return 1;
        return 0;
    }
    public int inDSHS()
    {
        QLhocSinh.inDS();
        return 1;
    }
        public int inDSGVGD()
    {
        QLgiaoVienGD.inDS();
        return 1;
    }
}
