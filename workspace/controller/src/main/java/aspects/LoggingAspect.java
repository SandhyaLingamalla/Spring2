package aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Before("within(com.dbs.empMgmt.*.*)")
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println("Befor executing this method ::");
		Arrays.asList(joinPoint.getArgs()).forEach(System.out::println);
	}
	
	@After("within(com.dbs.empMgmt.*.*)")
	public void logAfter()
	{
		System.out.println("After executing the method :: ");
	}
}
