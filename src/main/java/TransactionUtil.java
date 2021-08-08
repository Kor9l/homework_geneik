public class TransactionUtil {
    static void executeTransaction(BaseWallet walletFrom, BaseWallet walletTo, Number amount) {
        try {
            if ((walletFrom.getAmount().doubleValue() - amount.doubleValue()) < 0) {
                throw new AmountException("To low amount");
            }
            walletFrom.setAmount((walletFrom.getAmount().doubleValue() - amount.doubleValue()));
            walletTo.setAmount(walletTo.getAmount().doubleValue() + amount.doubleValue());
        } catch (AmountException e) {
            e.printStackTrace();
        }

    }
}
