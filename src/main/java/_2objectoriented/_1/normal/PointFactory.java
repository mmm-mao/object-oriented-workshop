/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._1.normal;


import _2objectoriented._1.DateUtil;

public class PointFactory {

    public static int calculateGrantPoint(int goodsAmount, String birthday) {

        int age = DateUtil.calculatorElapsedYears(birthday);

        if (age > 59) {
            return (int) (goodsAmount * 0.1 * 2);
        }

        return (int) (goodsAmount * 0.1);
    }
}
