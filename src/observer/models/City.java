package observer.models;

public class City {
    public String cityName;
    public String weather;
    public City(){

    }
    public City(String cityName) {
        this.cityName = cityName;
    }
    public City(String cityName, String weather) {
        this.cityName = cityName;
        this.weather = weather;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
