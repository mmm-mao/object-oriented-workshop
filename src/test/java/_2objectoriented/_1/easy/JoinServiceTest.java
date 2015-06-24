/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._1.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class JoinServiceTest {

    private final JoinService joinService = new JoinService();

    private final Name name = new Name("氏名");

    @Test
    public void _20歳() {

        boolean actual = joinService.check(name, new Birthday("19950202"));
        boolean expected = true;

        assertThat(actual, is(expected));

    }

    @Test
    public void _19歳() {

        boolean actual = joinService.check(name, new Birthday("19950203"));
        boolean expected = false;

        assertThat(actual, is(expected));

    }
}
