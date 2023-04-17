package uz.bakhromjon.aop.action;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class ActionAspect {
    @Autowired
    private UserActionRepository userActionRepository;

    @AfterReturning(value = "@annotation(Action)")
    public void saveAction(JoinPoint joinPoint) throws Throwable {
        Action action = ((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(Action.class);
        UserAction userAction = new UserAction(1L, LocalDateTime.now(), action.message(), action.type());
        userActionRepository.save(userAction);
    }

}
