package example.beans;

import com.google.inject.internal.Annotations;
import example.annotations.BasicAuthorization;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@Aspect
@Component
public class TracingAspect {
    @Before("@annotation(example.annotations.SampleAnnotation)||@target(example.annotations.SampleAnnotation)")
    public void logFunc(JoinPoint jp) {
        System.out.println(jp.getSignature().getName() + " called at " + new Date());
    }

    @Before("@annotation(example.annotations.BasicAuthorization)||@target(example.annotations.BasicAuthorization)")
    public void authorize(JoinPoint jp)  {
        System.out.println("authorized ");
        for(Annotation a : ((MethodSignature) jp.getSignature()).getMethod().getAnnotations()) {
            if(a instanceof BasicAuthorization) {
                System.out.println(((BasicAuthorization) a).policyName());
            }
        }
    }
}
