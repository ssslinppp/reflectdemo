package com.ssslinppp.reflectdemo.reflect;

import com.ssslinppp.reflectdemo.annotations.ClassAnnotation;
import com.ssslinppp.reflectdemo.annotations.MethodAnnotation;
import com.ssslinppp.reflectdemo.annotations.ParamAnnotation;
import org.reflections.Reflections;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Set;

@Component
public class ReflectDemo implements CommandLineRunner {
    /**
     * 获取带有 ClassAnnotation 声明的所有接口和类，并获取 ClassAnnotation 声明中的原数据
     */
    public void getTypesAnnotatedWith() {
        // 获取带有 ClassAnnotation 声明的所有接口和类
        Set<Class<?>> requests = new Reflections("com.ssslinppp.*").getTypesAnnotatedWith(ClassAnnotation.class);
        for (Class<?> cls : requests) {
            System.out.println("接口或类全名:" + cls.getName());
            for (Annotation annotation : cls.getAnnotations()) {
                System.out.println("  所有的接口信息 ：" + annotation.annotationType());
            }
            System.out.println("   获取ClassAnnotation声明的classAlias：" + cls.getAnnotation(ClassAnnotation.class).classAlias());
            System.out.println();
        }
    }

    public void getMethodInfo() {
        // 获取带有 ClassAnnotation 声明的所有接口和类
        Set<Class<?>> requests = new Reflections("com.ssslinppp.*").getTypesAnnotatedWith(ClassAnnotation.class);
        for (Class<?> cls : requests) {
            System.out.println("类或接口名：" + cls.getSimpleName());
            for (Method method : cls.getMethods()) {
                System.out.println("   方法名：" + method.getName() + ", 返回值类型：" + method.getReturnType());

                // 获取方法Annotation
                MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);
                System.out.println("   方法Annotation原数据，methodAlias：" + methodAnnotation.methodAlias());

                // 获取参数
                for (Parameter parameter : method.getParameters()) {
                    System.out.println("    参数别名：" + parameter.getAnnotation(ParamAnnotation.class).alias());
                }
                System.out.println();
            }
        }
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("@@@@ 获取所有 ClassAnnotation 声明的类和接口  start @@@@ ");
        getTypesAnnotatedWith();
        System.out.println("@@@@ 获取所有 ClassAnnotation 声明的类和接口  end @@@@ ");
        System.out.println();

        System.out.println("@@@@ 获取 方法信息  start @@@@ ");
        getMethodInfo();
        System.out.println("@@@@ 获取 方法信息  end @@@@ ");
    }
}
