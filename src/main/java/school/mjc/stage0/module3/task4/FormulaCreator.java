package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1, b = 2;
        double right = (((((9 * a) * a) - (5 * b)) + 2) + a) - 7;
        double left = ((a + b) - ((4 * a) * b))/2;
        double formula = right * left;
        System.out.println(formula);
    }
}
