package _2objectoriented._5;

public enum TourType {

    沖縄弾丸ツアー(new BasicFee(10000), DiscountPattern.南国旅行),
    沖縄ゆったりツアー(new BasicFee(20000), DiscountPattern.南国旅行);

    private TourType(BasicFee 基本料金, DiscountPattern discountPattern){
        this.基本料金 = 基本料金;
        this.discountPattern = discountPattern;
    }

    private BasicFee 基本料金;
    private DiscountPattern discountPattern;

    public BasicFee get基本料金(){
        return 基本料金;
    }

    public DiscountPattern getDiscountPattern(){
        return discountPattern;
    }

    public int 一人あたりの季節の料金(Season season){
        return (int) (基本料金.getValue() * season.季節の料金を計算する(discountPattern));
    }
}
