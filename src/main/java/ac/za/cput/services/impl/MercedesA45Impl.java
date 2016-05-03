package ac.za.cput.services.impl;

import ac.za.cput.domain.CarData;
import ac.za.cput.services.CarService;

/**
 * Created by SHiRO_333 on 2016-04-27.
 */
public class MercedesA45Impl implements CarService
{
    public CarData getCar()
    {
        CarData carData = new CarData();
        carData.setModel("Mercedes A45 AMG");
        carData.setPowerInKW(280);
        carData.setExcellerationInSec(4.2);
        return carData;
    }
}
