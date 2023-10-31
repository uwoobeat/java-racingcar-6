package racingcar;

import java.util.List;
import racingcar.exception.InsufficientCarCountException;
import racingcar.exception.InsufficientRaceCountException;

public class Game {
    public static final int MIN_CARS_REQUIRED = 2;
    public static final int MIN_RACE_REQUIRED = 1;
    private final List<Car> cars;
    private final int raceCount;

    public Game(List<Car> cars, int raceCount) {
        validateCars(cars);
        validateRaceCount(raceCount);

        this.cars = cars;
        this.raceCount = raceCount;
    }

    private void validateCars(List<Car> cars) {
        if (cars.size() < MIN_CARS_REQUIRED) {
            throw new InsufficientCarCountException();
        }
    }

    private void validateRaceCount(int raceCount) {
        if (raceCount < MIN_RACE_REQUIRED) {
            throw new InsufficientRaceCountException();
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public GameResult play() {
        // TODO: 게임 플레이 구현
        return null;
    }
}
