/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._3;

/**
 *
 * 参加人数
 */
public class ParticipantCount {

    private final int value;

    public ParticipantCount(int value) {
        this.value = value;
    }

    public int 割引後の合計金額を計算する(int 一人あたりの季節の料金){

        return 割引後の一人あたりの料金を計算する(一人あたりの季節の料金) * value;
    }

    private int 割引後の一人あたりの料金を計算する(int 一人あたりの季節の料金){

        if(value >= 2 && value <= 4){
            return (int)(一人あたりの季節の料金 * 0.9);
        }

        if(value >= 5){
            return (int)(一人あたりの季節の料金 * 0.8);
        }

        return 一人あたりの季節の料金;
    }
}
