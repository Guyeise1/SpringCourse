package example.beans;

import example.annotations.SampleAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@SampleAnnotation
public class Customer {
    private String firstName;
    private String lastName;
    @Autowired
    @Value("100")
    private Integer id;

    @PostConstruct
    public void init() {
        System.out.println(getClass().getSimpleName() + " in @PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(getClass().getSimpleName() + " in @PreDestroy");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
