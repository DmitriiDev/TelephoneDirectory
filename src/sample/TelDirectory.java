package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelDirectory {

    Map<String, String> telDirMap = new HashMap<>();


    public void add(String number, String name){
        telDirMap.put(number, name);
    }

    public List<String> get(String name){
        List<String> listOfSameName = new ArrayList();
        String resualtOfserch = "";
        for(Map.Entry<String,String> entry : telDirMap.entrySet()){
            if(entry.getValue().equals(name)){
                resualtOfserch = name + " " + entry.getKey();
                listOfSameName.add(resualtOfserch);
            }
        }
        return listOfSameName;
    }

}
