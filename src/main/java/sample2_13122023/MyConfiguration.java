package sample2_13122023;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("sample2_13122023")
//public class MyConfiguration {
//
//}


@Configuration
@ComponentScan("sample2_13122023")
public class MyConfiguration {
	@Bean
	public Wifi getWifi() {
		return new Wifi();
	}
}