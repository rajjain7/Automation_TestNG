package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import pages.HomePage;
import pages.LoginPage;

@Configuration
@ComponentScan
@PropertySource({"test.properties"})

public class TestFrameworkConfiguration {
	

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean
	public static HomePage homePage() {
		return new HomePage();
	}
	
	@Bean
	public static LoginPage loginPage() {
		return new LoginPage();
	}

}
