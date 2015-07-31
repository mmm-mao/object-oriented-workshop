package _1refactoring._1answer;


import lombok.AllArgsConstructor;

import java.util.NoSuchElementException;

@AllArgsConstructor
public enum EmployeeType {

    担当(0, 1),
    主任(1, 2),
    マネージャー(2, 3),
    グループマネージャー(3, 4);

    private final int 外部からの値;

    private final int 時給の倍率;

    private final int 基本時給 = 1000;

    public int 時給を計算する(){
        return 基本時給 * 時給の倍率;
    }


    public static EmployeeType 外部の値から作成する(int outSideValue){

        for(EmployeeType employeeType : EmployeeType.values()){
            if(employeeType.外部からの値 == outSideValue){
                return employeeType;
            }
        }

        throw new NoSuchElementException("外部から指定された値が不正です");

    }

}
