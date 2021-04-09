package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);// chamar o construtor da super clase
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            // deposit(amount);
            balance += amount - 10.00;

        }
    }

    // sobreposição ou sobrecarga
    // super() chama a implentação do superclasse
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);//usa o metodo original
        balance -= 2.0; //implementa a alteração
    }
}
