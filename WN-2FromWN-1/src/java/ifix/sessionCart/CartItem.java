/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifix.sessionCart;

/**
 *
 * @author AMA Wickramarathna
 */
public class CartItem {
    private int pid;
    private String pname;
    private int qty;
    private double uprice;

    /**
     * @return the pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return pname;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.pname = name;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the uprice
     */
    public double getUprice() {
        return uprice;
    }

    /**
     * @param uprice the uprice to set
     */
    public void setUprice(double uprice) {
        this.uprice = uprice;
    }

    /**
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname the pname to set
     */
    public void setPname(String pname) {
        this.pname = pname;
    }
    
}
