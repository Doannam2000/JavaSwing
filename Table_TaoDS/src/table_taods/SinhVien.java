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
public class SinhVien {
    private String ID;
    private String hoTen;
    private Date NS;
    private String Que;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public SinhVien(String ID, String hoTen, Date NS,String Que) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.NS = NS;
        this.Que = Que;
    }
    
    public String getID() {
        return ID;
    }

    public String getHoTen() {
        return hoTen;
    }
    public String getQue() {
        return Que;
        }
    public String getNS() {
        String x = sdf.format(NS);
       return x;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setQue(String Que) {
        this.Que = Que;
    }
    public void setNS(Date NS) {
        this.NS = NS;
    }
    
    public SinhVien() {
    }
    
}
