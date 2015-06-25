/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._1.easy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TourFeeCalculateService {
    
    private final static int baseFee = 10000;

    private final DepartureMonth departureMonth;
    private final ParticipantCount participantCount;
    
    public int ツアー料金を計算する(){

        // 一人あたりの季節の料金計算
        int seasonFee = baseFee;
        if(departureMonth.getValue() >=  6 && departureMonth.getValue() <= 8){
            seasonFee = (int)(baseFee * 1.5);
        }else if(departureMonth.getValue() == 1 || departureMonth.getValue() == 2 || departureMonth.getValue() == 12){
            seasonFee = (int)(baseFee * 0.75);
        }
        

        // 割引前の合計金額計算
        int totalFee = seasonFee * participantCount.getValue();

        // 割引後の合計金額計算
        if(participantCount.getValue() >= 2 && participantCount.getValue() <= 4){
            totalFee = (int)(totalFee * 0.9);
        }else if(participantCount.getValue() >= 5){
            totalFee = (int)(totalFee * 0.8);
        }
        
        return totalFee;
        
    }
            
}
