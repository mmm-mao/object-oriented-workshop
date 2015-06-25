/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._1.normal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TourFeeCalculateService {
    
    private final static int baseFee = 10000;

    private final int departureMonth;
    private final int participantCount;

    
    public int ツアー料金を計算する(){

        // 一人あたりの季節の料金計算
        int seasonFee = baseFee;
        if(departureMonth >=  6 && departureMonth <= 8){
            seasonFee = (int)(baseFee * 1.5);
        }else if(departureMonth == 1 || departureMonth == 2 || departureMonth == 12){
            seasonFee = (int)(baseFee * 0.75);
        }


        // 割引前の合計金額計算
        int totalFee = seasonFee * participantCount;

        // 割引後の合計金額計算
        if(participantCount >= 2 && participantCount <= 4){
            totalFee = (int)(totalFee * 0.9);
        }else if(participantCount >= 5){
            totalFee = (int)(totalFee * 0.8);
        }
        
        return totalFee;
        
    }
            
}
