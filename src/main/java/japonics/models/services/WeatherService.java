package japonics.models.services;

import japonics.models.Config;
import japonics.models.Utils;
import org.json.JSONObject;

/**
 * Created by Justyna on 15.07.2017.
 */
public class WeatherService {
    private static WeatherService ourInstance = new WeatherService();

    public static WeatherService getService() {
        return ourInstance;
    }

    // Dane API
    private String appurl;

    //Dane z API
    private double temp;

    private WeatherService() {

    }

    public void makeCall(String city, String country){
        appurl = Config.APPURL + "weather" + "?q=" + city + "," + country + "&appid=" + Config.APPID;
        parseJsonData(Utils.connectAndResponse(appurl));
    }

    private void parseJsonData(String data){
        JSONObject rootObject = new JSONObject(data);
        JSONObject mainObject = rootObject.getJSONObject("main");

        temp = mainObject.getDouble("temp");
    }

    // Dostajemy się do danych ///
    public double getTemperature(){
        return temp;
    }
}