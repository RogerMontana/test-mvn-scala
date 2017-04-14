package javap.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by artem on 3/27/17.
 */
@RestController
@EnableAutoConfiguration
public class TweetDeskApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(TweetDeskApp.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static String greetingJava() {
		return "hi from java";
	}
}
