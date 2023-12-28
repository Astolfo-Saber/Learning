package islandofknowlegde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsIPv4Address {
    public boolean solution(String inputString) {
        ArrayList<String> list = new ArrayList(List.of(inputString.split("\\.")));
        if (list.size() != 4 ) return false;
        try{
            for (String s : list) {
                if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255 || (s.length() > 1 && s.indexOf("0") == 0) ) {
                    return false;
                }
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public boolean imporveSolution(String inputString){
        return inputString.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    }
}
