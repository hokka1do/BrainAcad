package packages.technics;

import java.util.Date;

public class Passport {
    private String brand;
    private String type;
    private int model;
    private int modelNumber;
    private int warranty;
    Date warrantyStartDate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModelnumber() {
        return modelNumber;
    }

    public void setModelnumber(int modelnumber) {
        this.modelNumber = modelnumber;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }
}
