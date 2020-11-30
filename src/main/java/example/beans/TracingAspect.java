package example.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import example.annotations.SampleAnnotation;

import java.util.Date;

@Aspect
@Component
public class TracingAspect {
    @Before("@annotation(example.annotations.SampleAnnotation)||@target(example.annotations.SampleAnnotation)")
    public void logFunc(JoinPoint jp) {
        System.out.println(jp.getSignature().getName() + " called at " + new Date());
    }
}
