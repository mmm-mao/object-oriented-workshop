/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1answer;


import _2objectoriented.point._1.DateUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PointFactory {

    private final GoodsFee goodsFee;
    private final Birthday birthday;

    public int 付与するポイントを計算する() {

        AgeType ageType = birthday.年齢区分を計算する();

        return goodsFee.付与するポイントを計算する(ageType);

    }
}
