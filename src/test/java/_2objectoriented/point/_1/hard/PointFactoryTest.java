/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.point._1.hard;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointFactoryTest {

    private final int goodsAmount = 100;

    @Test
    public void _59歳_19550203_100円の場合は10ポイント() {

        PointFactory pointFactory = new PointFactory();

        int actual = pointFactory.付与するポイントを計算する();

        //assertThat(actual, is(10));

    }

    @Test
    public void _60歳_19550202_100円の場合は20ポイント() {

        PointFactory pointFactory = new PointFactory();

        int actual = pointFactory.付与するポイントを計算する();

        //assertThat(actual, is(20));


    }
}
