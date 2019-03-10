package org.chengwei.minicode.business;

public class FizzBuzzStage1 {

    protected static int MAX_COUNT = 100; //停止数数的最大数字
    protected static final String[] OUTPUT_STR_ARR = new String[6]; //用于存放合符条件时替换的字符串
    protected static final String FIZZ_STR = "Fizz"; //能被3整除时替换的字符串
    protected static final String BUZZ_STR = "Buzz"; //能被5整除时替换的字符串

    static {
        OUTPUT_STR_ARR[3] = FIZZ_STR; //以数组下标为3存储能被3整除时替换的字符串
        OUTPUT_STR_ARR[5] = BUZZ_STR; //以数组下标为5存储能被5整除时替换的字符串
    }

    public void doFizzBuzz () {

		for (int i = 1; i <= MAX_COUNT; i++) {

            StringBuffer output = new StringBuffer();

            output = getOutput(i, output);

            System.out.println(output);
		}
	}

    /**
     * 获取判断是否能被3或5整除的字符串
     *
     * @param num       数到的数
     * @param output    输出字符串
     * @return
     */
    public StringBuffer getOutput(int num, StringBuffer output) {
        boolean isDivisibleBy3 = isDivisibleBy(output, num, 3);
        boolean isDivisibleBy5 = isDivisibleBy(output, num, 5);

        if (!isDivisibleBy3 && !isDivisibleBy5) {
            output = new StringBuffer(Integer.toString(num));
        }
        return output;
    }

    /**
     * 判断输入字符是否能被特定的数字整除，并根据结果组装输出字符
     * 
     * @param output        输出字符串
     * @param num           数到的数
     * @param devided       被除数
     * @return
     */
    private boolean isDivisibleBy(StringBuffer output, int num, int devided) {

        if (num % devided == 0) {
            output.append(OUTPUT_STR_ARR[devided]);
            return true;
        }
        return false;

    }

}
