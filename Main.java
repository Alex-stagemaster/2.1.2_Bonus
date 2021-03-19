public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        float balanceAccount = 15.5F;
        float payAdded = 1100.0F;
        int bonus;
        if (payAdded >= 1000.0F) {
            bonus = (int)(payAdded / 100.0F);
        } else {
            bonus = 0;
        }

        float balanceEnd = balanceAccount + payAdded + (float)bonus;
        String numberAsString = String.format("%.2f", balanceAccount);
        System.out.println("Сумма на вашем счете составляет " + balanceEnd + " рублей");
    }
}