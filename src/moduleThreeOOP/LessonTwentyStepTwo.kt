package moduleThreeOOP


open class BankAccount(
    private var balance: Int = 0,

) {

    fun deposit(amount: Int) {
        if (amount > 0) balance += amount
    }

    protected fun withdraw(amount: Int) {
        if (amount in 1..balance) balance -= amount
    }

    fun getBalance(): Int {
        return balance
    }
}

class SpecialBankAccount : BankAccount() {

    fun specialWithdraw(amount: Int) {
        val bankAccount = BankAccount()
        withdraw(amount)
    }
}
