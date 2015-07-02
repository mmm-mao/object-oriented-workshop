package _2objectoriented.travel._2answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 合計金額
 */
@AllArgsConstructor
public class TotalFee {

    @Getter
    private final int value;

    public TotalFee _10オフ(){
        return new TotalFee((int)(value * 0.9));
    }

    public TotalFee _20オフ(){
        return new TotalFee((int)(value * 0.8));
    }


}
