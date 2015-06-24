/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._1.easy;


import _2objectoriented._1.DateUtil;

public class PointFactory {

    public static int calculateGrantPoint(GoodsAmount goodsAmount, Birthday birthday) {

        int age = DateUtil.calculatorElapsedYears(birthday.getValue());

        if (age > 59) {
            return (int) (goodsAmount.getValue() * 0.1 * 2);
        }

        return (int) (goodsAmount.getValue() * 0.1);
    }
}
