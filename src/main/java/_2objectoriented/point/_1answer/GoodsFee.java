/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商品の金額
 */
@AllArgsConstructor
public class GoodsFee {

    @Getter
    private final int value;

    private final static double 基礎ポイント付与率 = 0.1;

    public int 付与するポイントを計算する(AgeType ageType){

        return (int)(value * 基礎ポイント付与率 * ageType.getポイント付与率());
    }


}
