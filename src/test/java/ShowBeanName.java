import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowBeanName {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
       // Object user= context.getBean("userController");
        String[] str=context.getBeanDefinitionNames();
        for (String string : str) {
            System.out.println("bean name :"+string);
        }
    }
}

