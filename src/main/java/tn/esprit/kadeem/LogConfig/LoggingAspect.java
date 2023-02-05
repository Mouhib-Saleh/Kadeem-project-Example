package tn.esprit.kadeem.LogConfig;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    //  private static final Logger l = LogManager.getLogger(LoggingAspect.class);
    @Before("execution( * tn.esprit.kadeem.services.*.*Imp.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Début Exécution de la methode " + LocalDateTime.now()  + " : ");
    }

    @After("execution(* tn.esprit.kadeem.services.*.*Imp.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("fin Exécution de la methode " + name + " : ");
    }
}
