/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._1answer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TourFeeCalculateService {

    private final static int 基本料金 = 10000;

    private final DepartureMonth departureMonth;
    private final ParticipantCount participantCount;


    public int ツアー料金を計算する() {

        SeasonBasicFee 一人あたりの季節の料金 = departureMonth.季節の基本料金を計算する(基本料金);

        TotalFee totalFee = participantCount.合計金額を計算する(一人あたりの季節の料金);

        return totalFee.getValue();

    }

}
