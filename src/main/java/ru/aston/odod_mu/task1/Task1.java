package main.java.ru.aston.odod_mu.task1;

//для себя попробовал enum

public class Task1 {
    public static void main(String[] args){

        Number[][] testValues = {
                TestValues.TEST_INT.getValues(),
                TestValues.TEST_DOUBLE.getValues(),
                TestValues.TEST_LONG.getValues()
        };

        for(Number[] values: testValues){
            if (values[0] instanceof Integer && values[1] instanceof Integer){
                System.out.println("Integer ADD: "+Calculator.add((int)values[0],(int)values[1]));
                System.out.println("Integer SUB: "+Calculator.sub((int)values[0],(int)values[1]));
                System.out.println("Integer DIV: "+Calculator.div((int)values[0],(int)values[1]));
                System.out.println("Integer MULT: "+Calculator.mult((int)values[0],(int)values[1]));
            }if (values[0] instanceof Double && values[1] instanceof Double){
                System.out.println("Double ADD: "+Calculator.add((double)values[0],(double)values[1]));
                System.out.println("Double SUB: "+Calculator.sub((double)values[0],(double)values[1]));
                System.out.println("Double DIV: "+Calculator.div((double)values[0],(double)values[1]));
                System.out.println("Double MULT: "+Calculator.mult((double)values[0],(double)values[1]));
            }if (values[0] instanceof Long && values[1] instanceof Long){
                System.out.println("Long ADD: "+Calculator.add((long)values[0],(long)values[1]));
                System.out.println("Long SUB: "+Calculator.sub((long)values[0],(long)values[1]));
                System.out.println("Long DIV: "+Calculator.div((long)values[0],(long)values[1]));
                System.out.println("Long MULT: "+Calculator.mult((long)values[0],(long)values[1]));
            }

        }
    }
}

class Calculator{

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static long add(long a, long b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static long sub(long a, long b){
        return a-b;
    }

    public static int mult(int a, int b){
        return a*b;
    }

    public static double mult(double a, double b){
        return a*b;
    }

    public static long mult(long a, long b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static double div(double a, double b){
        return a/b;
    }

    public static long div(long a, long b){
        return a/b;
    }

}

enum TestValues{
    TEST_INT(5,3),
    TEST_DOUBLE(5.2,3.6),
    TEST_LONG(500000L,3000000L);

    private final Number value1;
    private final Number value2;

    TestValues(Number value1, Number value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public Number[] getValues(){
        return new Number[]{value1, value2};
    }

}
