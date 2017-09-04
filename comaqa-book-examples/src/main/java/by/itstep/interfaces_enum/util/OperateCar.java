package by.itstep.interfaces_enum.util;

public interface OperateCar {

    int turn(Direction direction, double radius, double startSpeed, double endSpeed);

    int changeLanes(Direction direction, double startSpeed, double endSpeed);

    int signalTurn(Direction direction, boolean signalOn);

    int getRadarFront(double distanceToCar, double speedOfCar);

    int getRadarRear(double distanceToCar, double speedOfCar);
}
