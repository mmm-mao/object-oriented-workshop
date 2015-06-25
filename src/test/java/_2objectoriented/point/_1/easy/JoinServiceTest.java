/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class JoinServiceTest {

    private final Name name = new Name("氏名");

    @Test
    public void _20歳_19950202_の場合は入会可能() {

        JoinService joinService = new JoinService(name, new Birthday("19950202"));

        boolean actual = joinService.入会できるか判定する();

        assertThat(actual, is(true));

    }

    @Test
    public void _19歳_19950203の場合は入会不可() {

        JoinService joinService = new JoinService(name, new Birthday("19950203"));

        boolean actual = joinService.入会できるか判定する();

        assertThat(actual, is(false));

    }
}
