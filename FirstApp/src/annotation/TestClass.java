package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanconfig.xml");
		Car c1 = (Car) ctx.getBean("nano");
		c1.drive(); 
		Car c2=(Car) ctx.getBean("jaguar");
		c2.drive();

	}

}
