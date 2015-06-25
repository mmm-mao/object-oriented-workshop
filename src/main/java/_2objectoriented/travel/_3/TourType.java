package _2objectoriented.travel._3;

public enum TourType {

    沖縄弾丸ツアー(new BasicFee(10000)),
    沖縄ゆったりツアー(new BasicFee(20000));

    private TourType(BasicFee 基本料金){
        this.基本料金 = 基本料金;
    }

    private BasicFee 基本料金;

    public BasicFee get基本料金(){
        return 基本料金;
    }
}
