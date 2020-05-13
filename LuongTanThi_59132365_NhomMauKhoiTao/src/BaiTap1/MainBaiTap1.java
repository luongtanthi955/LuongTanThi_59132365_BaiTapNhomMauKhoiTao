/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class MainBaiTap1 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args)throws ParseException {
        // TODO code application logic here
        HoaDonHeader hoadonheader = new HoaDonHeader("HD001", new SimpleDateFormat("HH:mm:ss dd-MM-yyyy ").parse("8:10:15 13-05-2020 "), "Luong Tan Thi");
        
        CTHD cthd1 = new CTHD("SP01", "Iphone 8 plus", 1, 12000000, 0.05f);
        CTHD ctdh2 = new CTHD("SP02", "Samsung A7 Pro", 2, 5200000, 0.1f);
        CTHD cthd3 = new CTHD("SP03", "Xiaomi redme note 9 Pro", 2, 7800000, 0.15f);
        
        HoaDon hd = new HoaDon.Builder()
                .addHoaDonHeader(hoadonheader)
                .addCTHD(cthd1)
                .addCTHD(ctdh2)
                .addCTHD(cthd3)
                .build();
        System.out.println(hd.toString());      
    }
    
}
