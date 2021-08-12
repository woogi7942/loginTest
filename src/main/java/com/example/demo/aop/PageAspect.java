package com.example.demo.aop;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PageAspect {
//Logger logger =  LoggerFactory.getLogger(PageAspect.class);
/*
@Pointcut("execution(* com.example.demo.*.*(..))")
public void loginauth() {System.out.println("point cut");}
*/

//@Before("@annotation(com.example.demo.aop.LoginCheck)")
public void joinPoint(HttpServletRequest request, HttpServletResponse response) throws Throwable
{
	/*
	System.out.println("execution 실행 전 이것부터 실행");
	HttpSession session=(HttpSession) request.getSession();
	if(session.getAttribute("id")==null) {
		response.sendRedirect("/index");
	}
	*/
}


/*    @Around("execution(* com.example.demo.*.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
System.out.println("start");

Object result = pjp.proceed();
//System.out.println("end");
        return result;
    }
*/


}
