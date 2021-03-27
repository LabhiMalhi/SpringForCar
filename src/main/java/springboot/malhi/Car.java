package springboot.malhi;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Car {
    private final Engine engine;
    private int power;

    public Car(Engine engine, @Value("${engine.power}") int power) {
        this.engine = engine;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", power=" + power +
                '}';
    }
}
