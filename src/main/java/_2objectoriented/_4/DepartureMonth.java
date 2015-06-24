/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._4;

/**
 *
 * 出発月
 */
public class DepartureMonth {
    
    private final Month month;
    
    public DepartureMonth(int value){
        this.month = Month.create(value);
    }

    public int 一人あたりの季節の料金を計算する(BasicFee basicFee){
        return month.一人あたりの季節の料金を計算する(basicFee);
    }

}
