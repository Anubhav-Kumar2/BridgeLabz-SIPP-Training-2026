package ExceptionSolution;

public class InsufficientBalanceException extends Exception {
    double Balance;
    double withdrawlAmount;
    public InsufficientBalanceException(double Balance, double withdrawlAmount) {
        this.Balance = Balance;
        this.withdrawlAmount = withdrawlAmount;
    }
    @Override
    public String getMessage() {
        return "Insufficient balance! \n Balance Amount: " + Balance + ", Withdrawal amount: " + withdrawlAmount;
            
    }
}
