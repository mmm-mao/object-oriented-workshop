/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._1.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class PointFactoryTest {
    
        private final GoodsAmount goodsAmount = new GoodsAmount(100);

    @Test
    public void _59歳の場合は10ポイント() {

        int actual = PointFactory.calculateGrantPoint(goodsAmount, new Birthday("19550203"));
        int expected = 10;

        assertThat(actual, is(expected));

    }

    @Test
    public void _60歳の場合は20ポイント() {

        int actual = PointFactory.calculateGrantPoint(goodsAmount, new Birthday("19550202"));
        int expected = 20;

        assertThat(actual, is(expected));

    }
}
