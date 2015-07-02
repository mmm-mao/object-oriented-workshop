/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._3answer;


/**
 *
 * 出発月
 */
public class DepartureMonth {
    
    private final Month month;

    public DepartureMonth(int value){
        this.month = Month.create(value);
    }

    public Season 季節を判定する(){
        return month.季節を判定する();
    }
    

}
