package example;

import example.beans.Customer;
import example.configuration.SpringMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMain.class);
        Customer x = ctx.getBean(Customer.class);
        System.out.println(x.getId());

    }

}
