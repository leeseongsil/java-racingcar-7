package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberSupplier implements NumberSupplier {

    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;

    @Override
    public int supply() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }
}
