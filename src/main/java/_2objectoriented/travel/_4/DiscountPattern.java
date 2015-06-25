package _2objectoriented.travel._4;

public enum DiscountPattern {

    南国旅行(1, 1.5, 1, 0.75),
    雪国旅行(1, 0.75, 1, 1.5);

    private DiscountPattern(double 春の割引率, double 夏の割引率, double 秋の割引率, double 冬の割引率){
        this.春の割引率 = 春の割引率;
        this.夏の割引率 = 夏の割引率;
        this.秋の割引率 = 秋の割引率;
        this.冬の割引率 = 冬の割引率;
    }

    private double 春の割引率;
    private double 夏の割引率;
    private double 秋の割引率;
    private double 冬の割引率;

    public double get春の割引率(){
        return 春の割引率;
    }

    public double get夏の割引率(){
        return 夏の割引率;
    }

    public double get秋の割引率(){
        return 秋の割引率;
    }

    public double get冬の割引率(){
        return 冬の割引率;
    }


}
