package example.beans;

import example.annotations.BasicAuthorization;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Account {
    private long number;
    private float balance;
    private float overDraftCapt;
    private float overDraftInterest;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @BasicAuthorization(policyName = "myPolicy")
    public float getBalance() {
        return balance;
    }

    @BasicAuthorization(policyName = "myPolicy")
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getOverDraftCapt() {
        return overDraftCapt;
    }

    public void setOverDraftCapt(float overDraftCapt) {
        this.overDraftCapt = overDraftCapt;
    }

    public float getOverDraftInterest() {
        return overDraftInterest;
    }

    public void setOverDraftInterest(float overDraftInterest) {
        this.overDraftInterest = overDraftInterest;
    }
}
