/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented.travel._1.hard;

import org.hamcrest.CoreMatchers;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;

@RunWith(Enclosed.class)
public class TourFeeCalculateServiceTest {

    @RunWith(Theories.class)
    public static class _出発月変動による合計料金の確認 {


        private static final int 夏の料金 = 15000;
        private static final int 冬の料金 = 7500;
        private static final int 基本料金のまま = 10000;

        @DataPoints
        public static Fixture[] fixtures = {
            new Fixture(1, 1, 冬の料金),
            new Fixture(2, 1, 冬の料金),
            new Fixture(3, 1, 基本料金のまま),
            new Fixture(4, 1, 基本料金のまま),
            new Fixture(5, 1, 基本料金のまま),
            new Fixture(6, 1, 夏の料金),
            new Fixture(7, 1, 夏の料金),
            new Fixture(8, 1, 夏の料金),
            new Fixture(9, 1, 基本料金のまま),
            new Fixture(10, 1, 基本料金のまま),
            new Fixture(11, 1, 基本料金のまま),
            new Fixture(12, 1, 冬の料金),};

        @Theory
        public void _各月ごとの合計料金の確認(Fixture fixture) throws Exception {

            TourFeeCalculateService sut = new TourFeeCalculateService();

            int actual = sut.ツアー料金を計算する();

            assertThat(actual, CoreMatchers.is(fixture.totalCount));
        }

    }

    @RunWith(Theories.class)
    public static class _参加者変動による合計料金の確認 {

        private static final int 基本料金 = 10000;

        @DataPoints
        public static Fixture[] fixtures = {
            new Fixture(4, 1, 基本料金),
            new Fixture(4, 2, (int)(基本料金 * 2 * 0.9)),
            new Fixture(4, 3, (int)(基本料金 * 3 * 0.9)),
            new Fixture(4, 4, (int)(基本料金 * 4 * 0.9)),
            new Fixture(4, 5, (int)(基本料金 * 5 * 0.8)),
            new Fixture(4, 6, (int)(基本料金 * 6 * 0.8))};

        @Theory
        public void _参加者ごとの合計料金の確認(Fixture fixture) throws Exception {

            TourFeeCalculateService sut = new TourFeeCalculateService();

            int actual = sut.ツアー料金を計算する();

            assertThat(actual, CoreMatchers.is(fixture.totalCount));
        }

    }

    @RunWith(Theories.class)
    public static class _組み合わせによる合計料金の確認 {

        @DataPoints
        public static Fixture[] fixtures = {
            new Fixture(1, 5, (int)(7500 * 5 * 0.8))};

        @Theory
        public void _月_参加者によるの合計料金の確認(Fixture fixture) throws Exception {

            TourFeeCalculateService sut = new TourFeeCalculateService();

            int actual = sut.ツアー料金を計算する();

            assertThat(actual, CoreMatchers.is(fixture.totalCount));
        }

    }
        
    static class Fixture {

        int departureMonth;
        int participantCount;
        int totalCount;

        public Fixture(int departureMonth, int participantCount, int totalCount) {
            this.departureMonth = departureMonth;
            this.participantCount = participantCount;
            this.totalCount = totalCount;
        }
    }
}
