/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1answer;

import _2objectoriented.point._1.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Birthday {

    private final String value;

    public boolean 未成年か(){

        if(年齢を計算する() < 20) {
            return false;
        }

        return true;

    }

    public AgeType 年齢区分を計算する(){
        if(年齢を計算する() < 60) {
            return AgeType.未成年と高齢者の間;
        }

        return AgeType.高齢者;
    }

    private int 年齢を計算する(){
        return DateUtil.指定された年月日から経過年数を計算する(value);
    }

}
