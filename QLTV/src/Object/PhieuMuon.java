/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.sql.Date;

/**
 *
 * @author Nguyễn Hữu Hiếu
 */
public class PhieuMuon {
    private String maMuon;
    private String maKhach;
    private String maSach;
    private Date ngayMuon;
    private Date hanTra;
    private Date ngayTra;
    private float tienCoc;
    
    public PhieuMuon() {
        
    }
    
    public PhieuMuon(String maMuon, String maKhach, String maSach, Date ngayMuon, Date hanTra , Date ngayTra , float tienCoc) {
        this.maMuon = maMuon;
        this.maKhach = maKhach;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.ngayTra = ngayTra;
        this.tienCoc = tienCoc;
    }

    public PhieuMuon(String text, String text0, String text1, Date valueOf, Date valueOf0, Date valueOf1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMaMuon() {
        return maMuon;
    }
    public void setMaMuon(String mm) {
        this.maMuon = mm;
    }
    
    public String getMaKhach() {
        return maKhach;
    }
    public void setMaKhach(String mm) {
        this.maKhach = mm;
    }
    
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String mm) {
        this.maSach = mm;
    }
    
    public Date getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(Date nm) {
        this.ngayMuon = nm;
    }
    public Date getHanTra() {
        return hanTra;
    }
    public void setHanTra(Date ht) {
        this.hanTra = ht;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public float getTienCoc() {
        return tienCoc;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public void setTienCoc(float tienCoc) {
        this.tienCoc = tienCoc;
    }
    
    
    
    
}
