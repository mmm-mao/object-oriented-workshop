package _2objectoriented.travel._4;


public enum Season {

    春 {
        public double 割引率(DiscountPattern discountPattern) {
            return discountPattern.get春の割引率();
        }
    },
    夏{
        public double 割引率(DiscountPattern discountPattern) {
            return discountPattern.get夏の割引率();
        }
    },
    秋{
        public double 割引率(DiscountPattern discountPattern) {
            return discountPattern.get秋の割引率();
        }
    },
    冬{
        public double 割引率(DiscountPattern discountPattern) {
            return discountPattern.get冬の割引率();
        }
    };


    abstract double 割引率(DiscountPattern discountPattern);

    public double 季節の料金を計算する(DiscountPattern discountPattern){
        return  割引率(discountPattern);
    }




}
