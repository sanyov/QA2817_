package by.itstep.interfaces_enum.imlp;

import by.itstep.interfaces_enum.util.Direction;
import by.itstep.interfaces_enum.util.OperateCar;

public class OperateVaz2106 implements OperateCar {
    public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        throw new IllegalStateException("Sorry, changeLanes is not implemented");
    }

    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        if (startSpeed > 80) {
            throw new IllegalArgumentException("Speed is too high");
        }
        return 0;
    }

    public int signalTurn(Direction direction, boolean signalOn) {
        System.out.println(this.getClass().getName() + ": Turned to: " + direction + ", signal is: " + signalOn);
        return 0;
    }

    public int getRadarFront(double distanceToCar, double speedOfCar) {
        throw new IllegalStateException("Sorry, getRadarFront is not implemented");
    }

    public int getRadarRear(double distanceToCar, double speedOfCar) {
        throw new IllegalStateException("Sorry, getRadarRear is not implemented");
    }
}
