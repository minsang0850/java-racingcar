package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @DisplayName("go하면 포지션이 증가하는지 확인")
    @Test
    public void goTest() {
        Car car = new Car("Audi");
        int position = car.getPosition();
        car.go();
        assertThat(car.getPosition()).isEqualTo(position + 1);
    }

    @DisplayName("자동차 이름이 5자를 초과하는 경우")
    @Test
    public void exceedFiveCharacter() {
        assertThatExceptionOfType(RuntimeException.class)
          .isThrownBy(() -> new Car("overFive"));
    }

    @Test
    public void isSamePosition() {
        Car car = new Car("mizz");
        assertThat(car.isSamePosition(0)).isTrue();
        car.go();
        assertThat(car.isSamePosition(1)).isTrue();
    }

    @Test
    public void comparePosition() {
        Car car = new Car("mizz");
        for (int i = 0; i < 4; i++) {
            car.go();
        }
        assertThat(car.comparePosition(3)).isEqualTo(4);
        assertThat(car.comparePosition(4)).isEqualTo(4);
        assertThat(car.comparePosition(5)).isEqualTo(5);
    }
}