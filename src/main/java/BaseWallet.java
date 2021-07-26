public class BaseWallet<T extends Number>{
     T amount;
     BaseWallet(T amount){
         this.amount = amount;
     }

    public T getAmount() {
        return amount;
    }

    public void setAmount(T amount) {
        this.amount = amount;
    }
}
