package day45_Review;

import java.util.Locale;

public class City {

   private int cityPlateNumber;
   private String cityName;


    public City(int cityPlateNumber, String cityName) {
      /*  this.cityPlateNumber = cityPlateNumber;
        this.cityName = cityName;

       */
        setCityPlateNumber(cityPlateNumber);
        setCityName(cityName);

    }

    public int getCityPlateNumber() {
        return cityPlateNumber;
    }

    public void setCityPlateNumber(int cityPlateNumber) {
        this.cityPlateNumber = cityPlateNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName.toUpperCase().trim();
    }

    public String getFullCityName(){
        if (getCityName() != null){
            return getCityPlateNumber()+"-"+getCityName();
        }
        return "";
    }

    @Override
    public String toString() {
        return getFullCityName();
    }
}
