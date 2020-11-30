package example;

import example.beans.Account;
import example.configuration.SpringMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMain.class);
        Account a = ctx.getBean(Account.class);
        a.getBalance();
    }
}
