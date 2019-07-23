package models;

public class Vehicle {
    private int mYear;
    private String mBrand;
    private String mModel;
    private int mMiles;
    private int mPrice;

    public Vehicle(int year, String brand, String model, int miles, int price) {
        this.mYear = year;
        this.mBrand = brand;
        this.mModel = model;
        this.mMiles = miles;
        this.mPrice = price;

    }

    public boolean worthBuying(int maxPrice) {
        return (mPrice < maxPrice);
    }
    public int getPrice(){

        return mPrice;
    }

    public int getmYear() {
        return mYear;
    }

    public String getmBrand() {
        return mBrand;
    }

    public String getmModel() {
        return mModel;
    }

    public int getmMiles() {
        return mMiles;
    }

}
