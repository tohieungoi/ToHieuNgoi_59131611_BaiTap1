/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tohieungoi_59131611_lophoc;

import java.util.ArrayList;

/**
 *
 * @author tohie
 */
public class QLDS implements IQLDS{
     ArrayList<CaNhan> DSCaNhan =new ArrayList<CaNhan>();
    
    @Override
    public int them(CaNhan p) {
       DSCaNhan.add(p);
       return 1;
    }

    @Override
    public int xoa(String ten) {
       boolean isRemoved = DSCaNhan.removeIf((CaNhan p)->p.getHoTen().equals(ten));
       if(isRemoved) return 1;
       return 0;
    }

    @Override
    public void inDS() {
        for(int i=0;i< DSCaNhan.size();i++)
        {
            System.out.println(DSCaNhan.get(i).HienThiTT());
        }
    }
    
}
