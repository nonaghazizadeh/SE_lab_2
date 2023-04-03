package calculator;

import static java.lang.Math.sqrt;

public class Calculator {
    public double operate(int input, String opt) throws Exception {
        if (opt.equals("rvs")) return 1.0 / input;
        if (opt.equals("sqr")) return sqrt(input);
        throw new Exception("not handled input!");
    }
    public int add(int a, int b) {
        return a + b;
    }
}
