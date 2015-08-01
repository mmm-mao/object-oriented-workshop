/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1.hard;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JoinServiceTest {

    @Test
    public void _20歳_19950202_の場合は入会可能() {

        JoinService joinService = new JoinService();

        boolean actual = joinService.入会できるか判定する();

        //assertThat(actual, is(true));

    }

    @Test
    public void _19歳_19950203の場合は入会不可() {

        JoinService joinService = new JoinService();

        boolean actual = joinService.入会できるか判定する();

        //assertThat(actual, is(false));


    }
}
