package io.github.krzpob.jAnalyzer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by krzysztof on 07.05.16.
 */
@SpringBootApplication
public class JAnalyzeApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(JAnalyzeApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
