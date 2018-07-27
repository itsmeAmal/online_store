/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.model.laptopPriceDetail;
import java.util.ArrayList;

/**
 *
 * @author 4m4l
 */
public class Cart {

    private ArrayList<laptopPriceDetail> cr;

    public Cart() {
        cr = new ArrayList<>();
    }

    /**
     * @return the cr
     */
    public ArrayList<laptopPriceDetail> getCr() {
        return cr;
    }

    public void addToCart(laptopPriceDetail li) {
        for (int i = 0; i < cr.size(); i++) {
            laptopPriceDetail laptopPriceDetail1 = cr.get(i);
            if (laptopPriceDetail1.getLaptopPricedetailModelId().equals(li.getLaptopPricedetailModelId())) {
                li.setLaptopPriceDetailQty(laptopPriceDetail1.getLaptopPriceDetailQty() + li.getLaptopPriceDetailQty());
                cr.remove(laptopPriceDetail1);
            }
        }
    }

    public void removeItem(laptopPriceDetail li) {
        for (int i = 0; i < cr.size(); i++) {
            laptopPriceDetail laptopDetail = cr.get(i);
            if (laptopDetail.getLaptopPricedetailModelId().equals(li.getLaptopPricedetailModelId())) {
                cr.remove(laptopDetail);
            }
        }
    }

    void removeAllItem() {
        for (int i = 0; i < cr.size(); i++) {
            laptopPriceDetail ci = cr.get(i);
        }
        cr = null;
    }

}
