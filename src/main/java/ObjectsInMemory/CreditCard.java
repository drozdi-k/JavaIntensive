package ObjectsInMemory;

import java.util.Objects;

public class CreditCard {
    private String number;
    private String pinkode;
    private int balance;
    private int creditLimit;
    private int loanDebt;

    public CreditCard(String number, String pinkode) {
        this.number = number;
        this.pinkode = pinkode;
        balance = 0;
        loanDebt = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return balance == that.balance && creditLimit == that.creditLimit && loanDebt == that.loanDebt && Objects.equals(number, that.number) && Objects.equals(pinkode, that.pinkode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, pinkode, balance, creditLimit, loanDebt);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPinkode() {
        return pinkode;
    }

    public void setPinkode(String pinkode) {
        this.pinkode = pinkode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
    }

    public void deposit(String pinkode, int sum) throws ExceptionCreditCard {
        if (!this.pinkode.equals(pinkode)) throw new WrongPassEx();
        else {
            if (loanDebt > 0) {
                loanDebt -= sum;
                if (loanDebt < 0) balance += -loanDebt;
            } else balance += sum;
        }
    }

    public void withdraw(String pinkode, int sum) throws ExceptionCreditCard {
        if (!this.pinkode.equals(pinkode)) throw new WrongPassEx();
        else {
            if (balance + creditLimit < sum) throw new WrongSumEx();
            else {
                balance -= sum;
                if (balance < 0) creditLimit += balance;
            }
        }
    }
}