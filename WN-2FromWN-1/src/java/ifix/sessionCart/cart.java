/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.sessionCart;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AMA Wickramarathna
 */
public class cart {

    private List<CartItem> old_citems;

    //getter eka witharak encapsulate karala hadagatta, setter eken wedak ne me welawe
    public cart() {
        old_citems = new ArrayList<CartItem>();

    }

    /**
     * @return the old_citems
     */
    public List<CartItem> getOld_citems() {
        return old_citems;
    }

    public void addProductToCart(CartItem new_citems) {

        for (int i = 0; i < old_citems.size(); i++) {
            CartItem ci = old_citems.get(i);
            int qty = 0;

            if (ci.getPid() == new_citems.getPid()) {
                qty = ci.getQty() + new_citems.getQty();
                old_citems.remove(ci);
                new_citems.setQty(qty);

            }

        }

        old_citems.add(new_citems);

    }

    public void remveProduct(CartItem cit) {

        for (int i = 0; i < old_citems.size(); i++) {
            CartItem cartItem = old_citems.get(i);
            if (cit.getPid() == cartItem.getPid()) {
                old_citems.remove(cartItem);

            }

        }

    }

}
