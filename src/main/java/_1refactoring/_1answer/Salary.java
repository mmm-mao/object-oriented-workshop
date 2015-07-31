/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1refactoring._1answer;


public class Salary {
    
    private final int baseSalary = 1000;
    
    public int calculate(int outSideEmployeeType) {

        EmployeeType employeeType1 = EmployeeType.外部の値から作成する(outSideEmployeeType);

        return employeeType1.時給を計算する();
    }
}
