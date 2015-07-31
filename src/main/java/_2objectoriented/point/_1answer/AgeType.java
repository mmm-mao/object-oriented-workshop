package _2objectoriented.point._1answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AgeType {

    未成年と高齢者の間(1),
    高齢者(2);

    @Getter
    private final int ポイント付与率;
}
