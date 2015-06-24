package _2objectoriented._5;

public enum Month {

    _1月(1, Season.冬),
    _2月(2, Season.冬),
    _3月(3, Season.春),
    _4月(4, Season.春),
    _5月(5, Season.春),
    _6月(6, Season.夏),
    _7月(7, Season.夏),
    _8月(8, Season.夏),
    _9月(9, Season.秋),
    _10月(10, Season.秋),
    _11月(11, Season.秋),
    _12月(12, Season.冬);

    private Month(int num, Season season){
        this.num = num;
        this.season = season;
    }

    private int num;

    private Season season;

    public Season 季節を判定する(){
        return season;
    }

    public static Month create(int num){

        for(Month month : Month.values()){
            if(month.num == num){
                return month;
            }
        }

        throw new RuntimeException("月の指定が不正です");
    }
}
