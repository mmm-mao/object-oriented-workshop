/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1refactoring._1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import _1refactoring._1.Salary;
import org.junit.Test;


public class SalaryTest {

    private static final Salary sut = new Salary();

    @Test
    public void 担当の給料は1000() {
        assertCheck(0, 1000);
    }

    @Test
    public void 主任の給料は2000() {
        assertCheck(1, 2000);
    }

    @Test
    public void マネージャーの給料は3000() {
        assertCheck(2, 3000);
    }

    @Test
    public void グループマネージャの給料は4000() {
        assertCheck(3, 4000);
    }

    private static void assertCheck(int employeeType, int salary) {

        int actual = sut.calculate(employeeType);
        assertThat(actual, is(salary));
    }

}
