package example.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Account {
    private long number;
    private float balance;
    private float overDraftCapt;
    private float overDraftInterest;
}
