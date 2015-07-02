package _2objectoriented.travel._3answer;

public enum Season {

    春 {
        public double 割合(SeasonBasicFeeRate seasonBasicFeeRate) {
            return seasonBasicFeeRate.get春の割合();
        }
    },
    夏{
        public double 割合(SeasonBasicFeeRate seasonBasicFeeRate) {
            return seasonBasicFeeRate.get夏の割合();
        }
    },
    秋{
        public double 割合(SeasonBasicFeeRate seasonBasicFeeRate) {
            return seasonBasicFeeRate.get秋の割合();
        }
    },
    冬{
        public double 割合(SeasonBasicFeeRate seasonBasicFeeRate) {
            return seasonBasicFeeRate.get冬の割合();
        }
    };


    abstract double 割合(SeasonBasicFeeRate seasonBasicFeeRate);

    public double 季節料金の割合値を取得する(SeasonBasicFeeRate seasonBasicFeeRate){
        return  割合(seasonBasicFeeRate);
    }

}
