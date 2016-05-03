package ac.za.cput.domain;
import ac.za.cput.services.impl.BMWM2Impl;
import ac.za.cput.services.impl.MercedesA45Impl;
import junit.framework.Assert;
import ac.za.cput.services.CarService;
import junit.framework.TestCase;



/**
 *
 */
public class CarDataTest extends TestCase
{
    //private CarService service;
    private CarService service = new MercedesA45Impl();

    public void testModel()throws Exception
    {
       // service = new MercedesA45Impl();
        System.out.println("The car model is: " + service.getCar().getModel());
        Assert.assertEquals("Mercedes A45 AMG", service.getCar().getModel());
    }

    public void testPowerInKW()throws Exception
    {
       // service = new MercedesA45Impl();
        System.out.println("The car power in kiloWatt is: " + service.getCar().getPowerInKW());
        Assert.assertEquals(280, service.getCar().getPowerInKW());
    }

    public void testExcellerationInSec()throws Exception
    {
       // service = new MercedesA45Impl();
        System.out.println("The car excelleration in seconds is: " + service.getCar().getExcellerationInSec());
        Assert.assertEquals(4.2, service.getCar().getExcellerationInSec());
    }

}