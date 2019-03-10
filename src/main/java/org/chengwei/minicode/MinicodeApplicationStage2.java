package org.chengwei.minicode;

import org.chengwei.minicode.business.FizzBuzzStage2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinicodeApplicationStage2 {

	public static void main(String[] args) {
		SpringApplication.run(MinicodeApplicationStage2.class, args);
		FizzBuzzStage2 stage2 = new FizzBuzzStage2();
		stage2.doFizzBuzz();

	}

}
