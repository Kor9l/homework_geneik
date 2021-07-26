public class TransactionUtil {
    static void executeTransaction(BaseWallet walletFrom,BaseWallet walletTo,Number amount){
        try{
            if ((walletFrom.getAmount().doubleValue()-amount.doubleValue())>0){
                walletFrom.setAmount((walletFrom.getAmount().doubleValue()-amount.doubleValue()));
                walletTo.setAmount(walletTo.getAmount().doubleValue()+amount.doubleValue());
            }
            else {
                throw new AmountException("To low amount");
            }
        } catch (AmountException e) {
            e.printStackTrace();
        }

    }
}
