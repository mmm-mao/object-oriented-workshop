/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1.easy;


import _2objectoriented.point._1.DateUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PointFactory {

    private final GoodsFee goodsFee;
    private final Birthday birthday;

    public int 付与するポイントを計算する() {

        int age = DateUtil.指定された年月日から経過年数を計算する(birthday.getValue());

        if (age > 59) {
            return (int) (goodsFee.getValue() * 0.1 * 2);
        }

        return (int) (goodsFee.getValue() * 0.1);
    }
}
