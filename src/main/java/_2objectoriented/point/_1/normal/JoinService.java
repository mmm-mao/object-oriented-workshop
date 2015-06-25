/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1.normal;

import _2objectoriented.point._1.DateUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JoinService {

    private final String name;
    private final String birthday;

    public boolean 入会できるか判定する() {

        int age = DateUtil.指定された年月日から経過年数を計算する(birthday);
        if (age < 20) {
            return false;
        }

        return true;

    }

}
