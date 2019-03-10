package org.chengwei.minicode;

import org.chengwei.minicode.business.FizzBuzzStage1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinicodeApplicationStage1 {

	public static void main(String[] args) {
		SpringApplication.run(MinicodeApplicationStage1.class, args);
		FizzBuzzStage1 stage1 = new FizzBuzzStage1();
		stage1.doFizzBuzz();
	}

}
