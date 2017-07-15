package japonics.models;

/**
 * Created by Justyna on 15.07.2017.
 */
public class Config {
    public static final String APPID = "7eb69e68de04008bcd83527935f008aa"; // Klucz do API z openweathermap

    //W przyszłości stworzymy sobie buildera urla API, żeby ładnie nam się to komponowało, na ten moment
    //korzystamy z konkatenacji
    public static final String APPURL = "http://api.openweathermap.org/data/2.5/"; // URL do API z openweathermap
}