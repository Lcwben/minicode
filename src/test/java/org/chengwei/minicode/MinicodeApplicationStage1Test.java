package org.chengwei.minicode;

import org.chengwei.minicode.business.FizzBuzzStage1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MinicodeApplicationStage1Test {

    @Test
    public void testStage1FizzBuzz() {
        FizzBuzzStage1 stage1 = new FizzBuzzStage1();

        Assert.assertEquals("1", stage1.doFizzBuzz(1));
        Assert.assertEquals("Fizz", stage1.doFizzBuzz(6));
        Assert.assertEquals("FizzBuzz", stage1.doFizzBuzz(15));

    }
}