package by.itstep.interfaces_enum;

import by.itstep.interfaces_enum.util.Direction;
import by.itstep.interfaces_enum.util.OperateCar;
import by.itstep.interfaces_enum.util.OperateFactory;

public class InterfaceProgram {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            OperateCar operateCar = OperateFactory.createRandomOperate();
            System.out.println(operateCar.getClass().toString() + " created");
        }
        OperateCar operateCar1 = OperateFactory.createOperateBMW760i();
        turnLeftWithSignal(operateCar1);
        OperateCar operateCar2 = OperateFactory.createOperateVaz2106();
        turnLeftWithSignal(operateCar2);

        try {
            operateCar1.signalTurn(Direction.LEFT, true);
            operateCar1.changeLanes(Direction.LEFT, 100, 80);
        } catch (IllegalArgumentException | IllegalStateException error) {
            System.out.println(operateCar1.getClass().getName() + ": " + error.getMessage());
        }

        try {
            operateCar2.signalTurn(Direction.LEFT, true);
            operateCar2.changeLanes(Direction.LEFT, 100, 80);
        } catch (IllegalArgumentException error) {
            System.out.println(operateCar1.getClass().getName() + ": " + error.getMessage());
        }
    }

    private static void turnLeftWithSignal(OperateCar car) {
        car.signalTurn(Direction.LEFT, true);
    }
}
