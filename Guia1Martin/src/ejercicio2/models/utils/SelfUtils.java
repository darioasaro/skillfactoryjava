package ejercicio2.models.utils;

import java.text.DecimalFormat;

public class SelfUtils {
public static String getDuration(String competitor,double total){
    int hour = (int) total;
    double minutes = ((total - hour)*60);
    double seconds = (minutes%1)*60;
    DecimalFormat df = new DecimalFormat("#");
    return ("El competidor "+competitor +" tardo : " + hour + "hs-" + df.format(minutes) + "min-" +df.format(seconds) + "sec");

}
}
