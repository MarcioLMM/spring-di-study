package di.example;

import di.example.controllers.ConstructorInjectedController;
import di.example.controllers.MyController;
import di.example.controllers.PropertyInjectedController;
import di.example.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiStudyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiStudyApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
