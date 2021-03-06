package part02_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		
		String path = "part02_constructor/di.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
//		Service svc = (Service)context.getBean("svc1");
//		svc.prn1();
		
//		Service svc = (Service)context.getBean("svc2");
//		svc.prn2();

		Service svc = (Service)context.getBean("svc3");
		svc.prn3();
	}//end main()

}//end class
