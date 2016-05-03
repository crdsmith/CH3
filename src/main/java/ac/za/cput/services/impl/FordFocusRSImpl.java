package ac.za.cput.services.impl;

import ac.za.cput.domain.CarData;
import ac.za.cput.services.CarService;

/**
 * Created by SHiRO_333 on 2016-04-27.
 */
public class FordFocusRSImpl implements CarService
{
    public CarData getCar()
    {
        CarData carData = new CarData();
        carData.setModel("Ford Focus RS");
        carData.setPowerInKW(257);
        carData.setExcellerationInSec(4.7);
        return carData;
    }
}
