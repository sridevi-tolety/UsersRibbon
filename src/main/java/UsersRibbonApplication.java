
​
import org.springframework.boot.SpringApplication;​
import org.springframework.boot.autoconfigure.SpringBootApplication;​
import org.springframework.cloud.openfeign.EnableFeignClients;​
​
@SpringBootApplication​
@EnableFeignClients("com.users.ribbon")
@EnableEurekaClient​
public class UsersRibbonApplication {​
​
public static void main(String[] args) {​
SpringApplication.run(UsersRibbonApplication.class, args);​
}​
​
}​