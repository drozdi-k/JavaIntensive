package Loops;

public class CarService {

    public int accelerate(int targetSpeed, Car car){
        if(car.getCurrentSpeed()<targetSpeed){
            int i = car.getCurrentSpeed();
            while(i<=targetSpeed){
                if (i==car.getMaxSpeed()) break;
                else car.setCurrentSpeed(i++);
            }
        }
        return car.getCurrentSpeed();
    }
    public int decelerate(int targetSpeed,Car car){
        if(car.getCurrentSpeed()>targetSpeed){
            int i = car.getCurrentSpeed();
            while(i>=targetSpeed){
                if (i==0) break;
                else car.setCurrentSpeed(i--);
            }
        }
        return car.getCurrentSpeed();
    }
    public boolean isDriving(Car car){
        return car.getCurrentSpeed() > 0;
    }
    public boolean isStopped(Car car){
        return car.getCurrentSpeed() == 0;
    }
    public boolean canAccelerate(Car car){
        return car.getCurrentSpeed() < car.getMaxSpeed();
    }
}
