/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._1answer;

/**
 *
 * 参加人数
 */
public class ParticipantCount {

    private final int value;

    public ParticipantCount(int value) {
        this.value = value;
    }

    public TotalFee 合計金額を計算する(SeasonBasicFee seasonBasicFee){

        TotalFee totalFee = new TotalFee(seasonBasicFee.getValue() * value);

        return 割引後の料金を計算する(totalFee);
    }

    private TotalFee 割引後の料金を計算する(TotalFee totalFee){

        if(value >= 2 && value <= 4){
            return totalFee._10オフ();
        }

        if(value >= 5){
            return totalFee._20オフ();
        }

        return totalFee;
    }
}
