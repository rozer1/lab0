package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        List<String> list = new ArrayList<>();

        if(value == null){
            return Collections.emptyList();
        }

        for(int i=0;i<value.length(); i++){
            list.add(String.valueOf(value.charAt(i)));
        }

        list.add("");
        list.set(0,value);

        return list;
    }

}
