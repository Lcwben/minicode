package org.chengwei.minicode;

import org.chengwei.minicode.business.FizzBuzzStage1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MinicodeApplicationStage2Test {

	@Test
	public void testStage2FizzBuzz() {

		FizzBuzzStage1 stage1 = new FizzBuzzStage1();
		stage1.doFizzBuzz();
	}

}
