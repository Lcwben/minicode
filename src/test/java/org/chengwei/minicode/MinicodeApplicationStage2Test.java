package org.chengwei.minicode;

import org.chengwei.minicode.business.FizzBuzzStage2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MinicodeApplicationStage2Test {

	@Test
	public void testStage2FizzBuzz() {

		FizzBuzzStage2 stage2 = new FizzBuzzStage2();

		Assert.assertEquals("1", stage2.doFizzBuzz(1));
		Assert.assertEquals("Fizz", stage2.doFizzBuzz(6));
		Assert.assertEquals("FizzBuzz", stage2.doFizzBuzz(15));

		Assert.assertEquals("Fizz", stage2.doFizzBuzz(3));
		Assert.assertEquals("Buzz", stage2.doFizzBuzz(25));
		Assert.assertEquals("FizzBuzz", stage2.doFizzBuzz(35));
	}

}
