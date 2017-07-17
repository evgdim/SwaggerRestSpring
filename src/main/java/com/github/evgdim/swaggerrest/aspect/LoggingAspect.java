package com.github.evgdim.swaggerrest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	@Around("@annotation(Loggable) && execution(* *(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Aspect" + pjp);
		return pjp.proceed();
	}
}
