package _2objectoriented.travel._2answer;


public enum Season {

    春(1),
    夏(1.5),
    秋(1),
    冬(0.75);

    private Season(double rate){
        this.rate = rate;
    }

    private double rate;


    public SeasonBasicFee 季節の基本料金を計算する(BasicFee baseFee){
        return  new SeasonBasicFee((int) (baseFee.getValue() * rate));
    }


}
