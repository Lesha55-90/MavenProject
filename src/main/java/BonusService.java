public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;     // Rename percent to Percent
        long bonus = amount * percent / 100;  // Rename percent to Percent
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
