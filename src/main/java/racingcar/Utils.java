package racingcar;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    public static final String SPACE = " ";
    public static final String BLANK = "";
    public static final String COMMA = ",";
    public static final String RANDOM_OUTOF_BOUND = "범위를 초과한 난수입니다.";

    public static List<Car> enrollCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        Arrays.stream(carNames).forEach(x -> cars.add(new Car(x)));
        return cars;
    }

    public static String[] splitCarsName(String carsNameInput) {
        String[] carNames = carsNameInput.trim()
                .replace(SPACE, BLANK)
                .split(COMMA);
        return carNames;
    }

    public static boolean checkMove(int i) {
        if (i < 0 || i >= 10) {
            throw new NumberFormatException(RANDOM_OUTOF_BOUND);
        }
        if (i >= 4 && i <= 9) {
            return true;
        }
        return false;
    }
}
