/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._2.normal;

import org.hamcrest.CoreMatchers;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;

@RunWith(Enclosed.class)
public class TourFeeTest {

    @RunWith(Theories.class)
    public static class _出発月変動による合計料金の確認 {

        TourFee sut = new TourFee();

        private static final int COOLBIZ_TOTAL_FEE = 15000;
        private static final int WARMBIZ_TOTAL_FEE = 7500;
        private static final int NORMAL_TOTAL_FEE = 10000;

        @DataPoints
        public static Fixture[] fixtures = {
            new Fixture(1, 1, WARMBIZ_TOTAL_FEE),
            new Fixture(2, 1, WARMBIZ_TOTAL_FEE),
            new Fixture(3, 1, NORMAL_TOTAL_FEE),
            new Fixture(4, 1, NORMAL_TOTAL_FEE),
            new Fixture(5, 1, NORMAL_TOTAL_FEE),
            new Fixture(6, 1, COOLBIZ_TOTAL_FEE),
            new Fixture(7, 1, COOLBIZ_TOTAL_FEE),
            new Fixture(8, 1, COOLBIZ_TOTAL_FEE),
            new Fixture(9, 1, COOLBIZ_TOTAL_FEE),
            new Fixture(10, 1, NORMAL_TOTAL_FEE),
            new Fixture(11, 1, NORMAL_TOTAL_FEE),
            new Fixture(12, 1, WARMBIZ_TOTAL_FEE),};

        @Theory
        public void _各月ごとの合計料金の確認(Fixture fixture) throws Exception {


            // 実行
            int actual = sut.calculate(fixture.departureMonth, fixture.participantCount);

            // 確認
            assertThat(actual, CoreMatchers.is(fixture.totalCount));
        }

    }

    @RunWith(Theories.class)
    public static class _参加者変動による合計料金の確認 {

        TourFee sut = new TourFee();

        private static final int NORMAL_TOTAL_FEE = 10000;

        @DataPoints
        public static Fixture[] fixtures = {
            new Fixture(4, 1, NORMAL_TOTAL_FEE),
            new Fixture(4, 2, (int)(NORMAL_TOTAL_FEE * 2 * 0.9)),
            new Fixture(4, 3, (int)(NORMAL_TOTAL_FEE * 3 * 0.9)),
            new Fixture(4, 4, (int)(NORMAL_TOTAL_FEE * 4 * 0.9)),
            new Fixture(4, 5, (int)(NORMAL_TOTAL_FEE * 5 * 0.8)),
            new Fixture(4, 6, (int)(NORMAL_TOTAL_FEE * 6 * 0.8))};

        @Theory
        public void _参加者ごとの合計料金の確認(Fixture fixture) throws Exception {

            // 実行
            int actual = sut.calculate(fixture.departureMonth, fixture.participantCount);

            // 確認
            assertThat(actual, CoreMatchers.is(fixture.totalCount));
        }

    }

    @RunWith(Theories.class)
    public static class _組み合わせによる合計料金の確認 {

        TourFee sut = new TourFee();

        @DataPoints
        public static Fixture[] fixtures = {
            new Fixture(1, 5, (int)(7500 * 5 * 0.8))};

        @Theory
        public void _月_参加者によるの合計料金の確認(Fixture fixture) throws Exception {

            // 実行
            int actual = sut.calculate(fixture.departureMonth, fixture.participantCount);

            // 確認
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
