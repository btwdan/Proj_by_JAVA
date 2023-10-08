import java.math.BigDecimal;

public class Double {
    public static void main(String[] args) {
        int n = 500;
        int m = 500;

        BigDecimal doubleProduct = calculateDoubleProduct(n, m);
        System.out.println(doubleProduct);
    }

    public static BigDecimal calculateDoubleProduct(int n, int m) {
        BigDecimal result = BigDecimal.ZERO;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                BigDecimal denominator = BigDecimal.valueOf(i).add(BigDecimal.valueOf(j).pow(2));
                BigDecimal term = BigDecimal.ONE.divide(denominator, 100, BigDecimal.ROUND_HALF_UP);
                result = result.add(term);
            }
        }

        return result;
    }
}
