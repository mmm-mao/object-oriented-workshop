package _2objectoriented.travel._3answer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TourType {

    沖縄弾丸ツアー(new BasicFee(10000), SeasonBasicFeeRate.南国旅行),
    沖縄ゆったりツアー(new BasicFee(20000), SeasonBasicFeeRate.南国旅行),
    北海道弾丸ツアー(new BasicFee(10000), SeasonBasicFeeRate.雪国旅行);

    private final BasicFee basicFee;
    private final SeasonBasicFeeRate seasonBasicFeeRate;

    public SeasonBasicFee 一人あたりの季節料金を計算する(Season season){
        return new SeasonBasicFee((int) (basicFee.getValue() * season.季節料金の割合値を取得する(seasonBasicFeeRate)));
    }
}
