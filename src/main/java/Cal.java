//这是一个简单的计算器的类，有加减乘除四个方法

public class Cal {
    private double result;

    public Cal() {
        this.result = 0;
    }

    public double add(double a, double b) {
        this.result = a + b;
        return this.result;
    }

    public double sub(double a, double b) {
        this.result = a - b;
        return this.result;
    }

    public double mul(double a, double b) {
        this.result = a * b;
        return this.result;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        this.result = a / b;
        return this.result;
    }

    public double getResult() {
        return this.result;
    }

}
