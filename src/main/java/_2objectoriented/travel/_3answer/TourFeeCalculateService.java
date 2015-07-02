/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._3answer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TourFeeCalculateService {

    private final TourType tourType;
    private final DepartureMonth departureMonth;
    private final ParticipantCount participantCount;


    public int ツアー料金を計算する() {

        Season season = departureMonth.季節を判定する();

        SeasonBasicFee 一人あたりの季節の料金 = tourType.一人あたりの季節料金を計算する(season);

        TotalFee totalFee = participantCount.合計金額を計算する(一人あたりの季節の料金);

        return totalFee.getValue();

    }

}
