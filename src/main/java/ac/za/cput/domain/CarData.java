package ac.za.cput.domain;

import java.io.Serializable;

/**

 */
public class CarData implements Serializable {
    private String model;
    private int powerInKW;
    private double excellerationInSec;

    public CarData(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerInKW() {
        return powerInKW;
    }

    public void setPowerInKW(int powerInKW) {
        this.powerInKW = powerInKW;
    }

    public double getExcellerationInSec() {
        return excellerationInSec;
    }

    public void setExcellerationInSec(double excellerationInSec) {
        this.excellerationInSec = excellerationInSec;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "model='" + model + '\'' +
                ", powerInKW=" + powerInKW +
                ", excellerationInSec=" + excellerationInSec +
                '}';
    }
}

