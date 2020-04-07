import config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Enter {

	public static void main(String[] args) {
		//实例化容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//注册配置文件
		context.register(DemoConfig.class);
		//刷新容器
		context.refresh();
		//获取bean
		System.out.println(context.getBean(DemoConfig.class));


	}

}
