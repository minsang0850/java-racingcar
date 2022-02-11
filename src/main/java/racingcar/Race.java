package racingcar;

public class Race {

    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER_FOR_START = 4;

    public static int getMaxScore(Car[] cars) {
        final int CARS_COUNT = cars.length;
        int maximum = 0;
        for (int i = 0; i < CARS_COUNT; i++) {
            maximum = Math.max(maximum, cars[i].getPosition());
        }
        return maximum;
    }

    public static void repeatGame(Car[] cars, int times) {
        for (int j = 0; j < times; j++) {
            for (int i = 0; i < cars.length; i++) {
                int randomNumber = getRandomNumber();
                Race.compareWithFour(cars, i, randomNumber);
            }
            IOClass.printCurrentPosition(cars);
            System.out.println();
        }
    }

    static int getRandomNumber() {
        int randomNumber = (int) Math.floor(Math.random() * MAX_NUMBER);
        return randomNumber;
    }

    public static void compareWithFour(Car[] cars, int idx, int randomNumber) {
        if (randomNumber >= MIN_NUMBER_FOR_START) {
            cars[idx].go();
        }
        return;
    }
}
