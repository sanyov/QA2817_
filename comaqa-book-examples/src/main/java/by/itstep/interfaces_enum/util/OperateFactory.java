package by.itstep.interfaces_enum.util;

import by.itstep.interfaces_enum.imlp.OperateBMW760i;
import by.itstep.interfaces_enum.imlp.OperateVaz2106;

import java.util.Random;

public class OperateFactory {

    private static Random RANDOM = new Random();

    public static OperateCar createOperateBMW760i() {
        return new OperateBMW760i();
    }
    public static OperateCar createOperateVaz2106() {
        return new OperateVaz2106();
    }

    public static OperateCar createRandomOperate() {
        return RANDOM.nextInt(2) == 0 ? createOperateBMW760i() : createOperateVaz2106();
    }
}
