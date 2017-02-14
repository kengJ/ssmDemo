package com.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
private static final long serialVersionUID = -3560655699428032777L;
    
    private Integer id;
    
    private String pname;
    
    private String pnumber;
    
    private String ptype;
    
    private Date pdate;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPnumber() {
        return pnumber;
    }
    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
    public String getPtype() {
        return ptype;
    }
    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
    public Date getPdate() {
        return pdate;
    }
    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }
}
