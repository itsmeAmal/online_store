/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.core;

/**
 *
 * @author 4m4l
 */
public class Options {

    private static int user = 1;
    private static int admin = 2;
    private static int manager = 3;
    private static int superUser = 4;

    private static int activeUser = 1;
    private static int pending = 2;
    private static int inactiveUser = 3;

    public static int PAYMENT_SUCCESS = 1;
    public static int PRODUCT_ISSUED = 2;
    public static int PRODUCT_DELIVERED = 3;

    /**
     * @return the user
     */
    public static int getUser() {
        return user;
    }

    /**
     * @param aUser the user to set
     */
    public static void setUser(int aUser) {
        user = aUser;
    }

    /**
     * @return the admin
     */
    public static int getAdmin() {
        return admin;
    }

    /**
     * @param aAdmin the admin to set
     */
    public static void setAdmin(int aAdmin) {
        admin = aAdmin;
    }

    /**
     * @return the manager
     */
    public static int getManager() {
        return manager;
    }

    /**
     * @param aManager the manager to set
     */
    public static void setManager(int aManager) {
        manager = aManager;
    }

    /**
     * @return the superUser
     */
    public static int getSuperUser() {
        return superUser;
    }

    /**
     * @param aSuperUser the superUser to set
     */
    public static void setSuperUser(int aSuperUser) {
        superUser = aSuperUser;
    }

    /**
     * @return the activeUser
     */
    public static int getActiveUser() {
        return activeUser;
    }

    /**
     * @param aActiveUser the activeUser to set
     */
    public static void setActiveUser(int aActiveUser) {
        activeUser = aActiveUser;
    }

    /**
     * @return the inactiveUser
     */
    public static int getInactiveUser() {
        return inactiveUser;
    }

    /**
     * @param aInactiveUser the inactiveUser to set
     */
    public static void setInactiveUser(int aInactiveUser) {
        inactiveUser = aInactiveUser;
    }

}
