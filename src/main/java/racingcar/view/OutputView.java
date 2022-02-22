package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class OutputView {

    private OutputView() {
    }

    public static void printCurrentPosition(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printfCarPosition(car);
            System.out.println();
        }
    }

    private static void printfCarPosition(Car car) {
        for (int j = 0; j < car.getPosition(); j++) {
            System.out.print("-");
        }
    }

    public static void printWinners(List<String> winnerNames) {
        System.out.print("최종 우승자: ");
        System.out.println(String.join(", ", winnerNames));
    }
}