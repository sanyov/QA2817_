package by.itstep._02_variables;

public class VariablesProgram {
    //переменная экземпляра класса, доступная всем его методам
    String classVariable = "I am a class variable";


    public void VariablesProgram() {
        myMethod();
    }

    private void myMethod() {
        //локальная переменная, доступная только внутри метода
        double localVariable;

        for (int i = 0; i < 10; ++i) {
            //локальная переменная, доступная только внутри цикла
            int localCycleVariable;
        }


    }

    public static void main(String[] args) {
        VariablesProgram variablesProgram = new VariablesProgram();
    }
}
