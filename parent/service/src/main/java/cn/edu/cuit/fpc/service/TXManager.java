package cn.edu.cuit.fpc.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TXManager {

//(public/private/protected 返回类型 包名.类名.方法名/方法名片段*/*方法名片段(参数/*(代表一个参数)/*,Object))

//    @Around("execution(* cn.edu.cuit.fpc.service.*.*(..))")
//    public Object txAround(ProceedingJoinPoint point) throws Throwable {
//        System.out.println("@Around：执行目标方法之前...");
//        //访问目标方法的参数：
//        Object[] args = point.getArgs();
//        System.out.println("参数：" + args[0]);
//        Object returnValue = point.proceed(args);
//        System.out.println("@Around：执行目标方法之后...");
//        System.out.println("@Around：被织入的目标对象为：" + point.getTarget());
//        return "原返回值：\"" + returnValue + "\"，这是修正后的返回结果";
//    }
//
//    @Before("execution(* cn.edu.cuit.fpc.service.ServiceProvider.run(..))")
//    public void txBegin() {
//        System.out.println("Starting provide services...");
//    }
//
//    @After("execution(* cn.edu.cuit.fpc.service.ServiceProvider.run(..))")
//    public void txAfter() {
//        System.out.println("Stopped provide services...");
//    }
//
//    @AfterReturning("execution(* cn.edu.cuit.fpc.service.*.*(..))")
//    public void txCommit() {
//        System.out.println("tx commit");
//    }
//
//    @AfterThrowing("execution(* cn.edu.cuit.fpc.service.*.*(..))")
//    public void txRollBack() {
//        System.out.println("tx roll back");
//    }
//
//    @Pointcut("execution(* cn.edu.cuit.fpc.service.*.*(..))")
//    public void txPointcut() {
//
//    }

}
