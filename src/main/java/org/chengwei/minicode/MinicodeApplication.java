package org.chengwei.minicode;

import org.chengwei.minicode.business.FizzBuzzStage1;
import org.chengwei.minicode.business.FizzBuzzStage2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinicodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinicodeApplication.class, args);
		FizzBuzzStage1 stage1 = new FizzBuzzStage1();
		FizzBuzzStage2 stage2 = new FizzBuzzStage2();
		System.out.println("################### requirement 1:");
		stage1.doFizzBuzzForLoop();
		System.out.println("################### requirement 1 end.");
		System.out.println();
		System.out.println("################### requirement 2:");
		stage2.doFizzBuzzForLoop();
		System.out.println("################### requirement 2 end.");
	}

}
