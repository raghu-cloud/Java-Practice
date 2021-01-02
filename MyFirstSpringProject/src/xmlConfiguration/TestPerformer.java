
package xmlConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformer {

	public static void main(String[] args) {
		System.out.println("Performers beging performances");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("performer.xml");
		
		
		System.out.println("-----------");
		Performer p1=(Performer) ctx.getBean("duke");
		System.out.println("Duke being asked to Perform");
		 p1.perform();
		 System.out.println("------------------------");
		 
		 Performer p2=(Performer) ctx.getBean("hans");
		 System.out.println("hans being asked to Perform");
		 p2.perform();
		 System.out.println("------------------------");
		 
		 
		 Performer kenny=(Performer) ctx.getBean("kenny");
		 System.out.println("kenny being asked to Perform");
		 kenny.perform();
		 System.out.println("------------------------");
		 
		 
		 
		 
		 Performer oneman=(Performer) ctx.getBean("oneman");
		 System.out.println("onemanband being asked to Perform");
		 oneman .perform();
		 System.out.println("------------------------");

	}
}


