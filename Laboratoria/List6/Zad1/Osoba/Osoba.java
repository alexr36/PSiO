package List6.Zad1.Osoba;

import List6.Zad1.Konto.Konto;

public class Osoba {
    //  ==  Class fields ===============================================================================================

    private Konto account;

    //  ==  Constructors ===============================================================================================

    public Osoba(Konto account) {
        this.account = account;
    }


    //  ==  Public methods =============================================================================================

    public void aktywujKonto() {
        account.aktywuj();
    }


    public void dezaktywujKonto() {
        account.dezaktywuj();
    }


    //  ==  Getters and Setters ========================================================================================

    public Konto getAccount() {
        return account;
    }

    public void setAccount(Konto account) {
        this.account = account;
    }
}
