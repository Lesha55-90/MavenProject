public class BonusService {
    public long calculate(long amount, boolean registered) {
        int Percent = registered ? 3 : 1;     // Rename percent to Percent
        long bonus = amount * Percent / 100;  // Rename percent to Percent
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
