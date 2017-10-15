package ru.atom.yes_no.model;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Fella on 15.10.2017.
 */
@Component
public class YesNo_Impl implements YesNo{
    final Random random = new Random();

    public String tall(){
      int i =  random.nextInt(2);
        if( i == 0){
            return "No";
        } else {
            return "Yes";
        }
    }
}
