public class Main {
    public static void main(String[] args) {
       GoldWallet goldWallet = new GoldWallet(23);
        PlatinumWallet platinumWallet = new PlatinumWallet(23.5);
        //TransactionUtil.executeTransaction(goldWallet,platinumWallet,43);
        TransactionUtil.executeTransaction(goldWallet,platinumWallet,20);
        System.out.println(goldWallet.getAmount());
        System.out.println(platinumWallet.getAmount());
    }
}
