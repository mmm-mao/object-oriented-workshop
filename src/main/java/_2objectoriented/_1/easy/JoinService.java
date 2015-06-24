/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._1.easy;


import _2objectoriented._1.DateUtil;

public class JoinService {

    public boolean check(Name name, Birthday birthday) {

        int age = DateUtil.calculatorElapsedYears(birthday.getValue());
        if (age < 20) {
            return false;
        }

        return true;

    }

}
