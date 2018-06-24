package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {

        
        
        
        Television myTv = new Television();
        
        myTv.info();
        
        myTv.setCurrentProgram(5);
        myTv.setTurnOn(true);
        myTv.setVolume(50);
        
        myTv.info();
        
        myTv.setCurrentProgram(8);
        myTv.setTurnOn(true);
        myTv.setVolume(30);

        myTv.info();
        
         
        Radio myRadio = new Radio(100.3, 700, 'A');
        myRadio.info();
        
    }

}
