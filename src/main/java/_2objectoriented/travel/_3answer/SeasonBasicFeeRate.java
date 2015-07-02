package _2objectoriented.travel._3answer;

import lombok.Getter;

public enum SeasonBasicFeeRate {

    南国旅行(1, 1.5, 1, 0.75),
    雪国旅行(1, 0.75, 1, 1.5);

    private SeasonBasicFeeRate(double 春の割合, double 夏の割合, double 秋の割合, double 冬の割合){
        this.春の割合 = 春の割合;
        this.夏の割合 = 夏の割合;
        this.秋の割合 = 秋の割合;
        this.冬の割合 = 冬の割合;
    }

    @Getter
    private double 春の割合;

    @Getter
    private double 夏の割合;

    @Getter
    private double 秋の割合;

    @Getter
    private double 冬の割合;




}
