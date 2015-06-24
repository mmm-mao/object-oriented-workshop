/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1refactoring;


public class Salary {
    
    private final int baseSalary = 1000;
    
    public int calculate(int employeeType){
        
        // 担当者の場合
        if(employeeType == 0){
            return baseSalary;
        }
        
        // 主任の場合
        if(employeeType == 1){
            return baseSalary * 2;
        }
        
        // マネージャーの場合
        if(employeeType == 2){
            return baseSalary * 3;
        }
        
        // グループマネージャの場合
        return baseSalary * 4;
    }
    
}
