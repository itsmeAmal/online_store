/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.Validations;
import ifix.dao.Impl.laptopModelDaoImpl;
import ifix.model.LaptopModel;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class laptopModelController {

    public static boolean addlaptopModel(String modelId, String laptopId, String hardDisk, String ram, String vga, String processor, String usbType1, String usbType2, boolean hdmi, boolean vgaOP, String screenSize, String cache, String status) throws SQLException {
        laptopModelDaoImpl lapModelDaoImpl = new laptopModelDaoImpl();
        LaptopModel laptopModel = new LaptopModel();
        laptopModel.setLaptopModelId(Validations.getIntOrZeroFromString(modelId));
        laptopModel.setLaptopModelLaptopId(Validations.getIntOrZeroFromString(laptopId));
        laptopModel.setLaptopModelHardDisk(hardDisk);
        laptopModel.setLaptopModelRam(ram);
        laptopModel.setLaptopModelVga(vga);
        laptopModel.setLaptopModelProcessor(processor);
        laptopModel.setLaptopModelUsbType1(usbType1);
        laptopModel.setLaptopModelUsbType2(usbType2);
        laptopModel.setLaptopModelHdmi(hdmi);
        laptopModel.setLaptopModelVgaUotput(vgaOP);
        laptopModel.setLaptopModelScreenSize(screenSize);
        laptopModel.setLaotopModelCacheMemory(Validations.getIntOrZeroFromString(cache));
        laptopModel.setLaptopModelStatus(Validations.getIntOrZeroFromString(cache));
        lapModelDaoImpl.addLaptopModel(laptopModel);
        return true;
    }

}
