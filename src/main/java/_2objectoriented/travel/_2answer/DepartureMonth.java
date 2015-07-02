/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._2answer;

/**
 *
 * 出発月
 */
public class DepartureMonth {
    
    private final Month month;

    public DepartureMonth(int value){
        this.month = Month.create(value);
    }

    public SeasonBasicFee 季節の基本料金を計算する(BasicFee basicFee){
        return month.季節の基本料金を計算する(basicFee);
    }

}
