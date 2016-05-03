package ac.za.cput.services.impl;

import ac.za.cput.domain.CarData;
import ac.za.cput.services.CarService;

/**
 * Created by SHiRO_333 on 2016-04-27.
 */
public class BMWM2Impl implements CarService
{
    public CarData getCar()
    {
        CarData carData = new CarData();
        carData.setModel("BMW M2");
        carData.setPowerInKW(272);
        carData.setExcellerationInSec(4.3);
        return carData;
    }
}
