package Loops;

import org.junit.Test;
import org.apache.log4j.Logger;

import static org.junit.Assert.*;

public class CarServiceTest {

    Logger logger = Logger.getLogger(CarServiceTest.class);
    CarService carService = new CarService();
    Car car = new Car("Citroen","Green", 240);

    @Test
    public void accelerate() {
        int targetSpeed = 110;
        car.setCurrentSpeed(57);
        logger.info(carService.accelerate(targetSpeed,car));
    }

    @Test
    public void decelerate() {
        int targetSpeed = 25;
        car.setCurrentSpeed(157);
        logger.info(carService.decelerate(targetSpeed,car));
    }

    @Test
    public void isDriving() {
        car.setCurrentSpeed(57);
        logger.info(carService.isDriving(car));
    }

    @Test
    public void isStopped() {
        car.setCurrentSpeed(57);
        logger.info(carService.isStopped(car));
    }

    @Test
    public void canAccelerate() {
        car.setCurrentSpeed(257);
        logger.info(carService.canAccelerate(car));
    }
}