/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_taods;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author May Tinh Hoang Phat
 */
public class hi {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           SinhVien x = new SinhVien();
           try
           {
               Date date = sdf.parse("19/11/2000");
               x.setNS(date);
           }
           catch(Exception ex)
           {
               ex.printStackTrace();
           }
           
        System.out.println(x.getNS());
    }
 
    
}
