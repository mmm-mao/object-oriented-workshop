/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._5;

public class TourFee {

    public int calculate(TourType tourType, DepartureMonth departureMonth, ParticipantCount participantCount){

        int 一人あたりの季節の料金 = tourType.一人あたりの季節の料金(departureMonth.季節を判定する());

       return participantCount.割引後の合計金額を計算する(一人あたりの季節の料金);
        
    }
            
}
