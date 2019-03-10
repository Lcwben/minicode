package org.chengwei.minicode.business;

public class FizzBuzzStage1 {

    protected static int MAX_COUNT = 100; //停止数数的最大数字
    protected static final String[] OUTPUT_STR_ARR = new String[6]; //用于存放合符条件时替换的字符串
    protected static final String FIZZ_STR = "Fizz"; //能被3整除时替换的字符串
    protected static final String BUZZ_STR = "Buzz"; //能被5整除时替换的字符串
    protected static final int DIVISOR_THREE = 3; //能被5整除时替换的字符串
    protected static final int DIVISOR_FIVE = 5; //能被5整除时替换的字符串

    static {
        OUTPUT_STR_ARR[3] = FIZZ_STR; //以数组下标为3存储能被3整除时替换的字符串
        OUTPUT_STR_ARR[5] = BUZZ_STR; //以数组下标为5存储能被5整除时替换的字符串
    }

    public void doFizzBuzzForLoop () {

        for (int i = 1; i <= MAX_COUNT; i++) {
            doFizzBuzz (i);
        }
    }

    public String doFizzBuzz (int num) {

        StringBuffer output = new StringBuffer();
        output = getOutput(num, output);
        System.out.println(output);
        return output.toString();
	}

    /**
     * 获取判断是否能被3或5整除的字符串
     *
     * @param num       数到的数
     * @param output    输出字符串
     * @return
     */
    public StringBuffer getOutput(int num, StringBuffer output) {
        boolean isDivisibleBy3 = isDivisibleBy(num, DIVISOR_THREE);
        boolean isDivisibleBy5 = isDivisibleBy(num, DIVISOR_FIVE);

        if (isDivisibleBy3) {
            output.append(OUTPUT_STR_ARR[DIVISOR_THREE]);
        }

        if (isDivisibleBy5) {
            output.append(OUTPUT_STR_ARR[DIVISOR_FIVE]);
        }

        if (!isDivisibleBy3 && !isDivisibleBy5) {
            output = new StringBuffer(Integer.toString(num));
        }
        return output;
    }

    /**
     * 判断输入字符是否能被特定的数字整除，并根据结果组装输出字符
     *
     * @param num           数到的数
     * @param devided       被除数
     * @return
     */
    protected boolean isDivisibleBy(int num, int devided) {

        if (num % devided == 0) {
            return true;
        }
        return false;

    }

}
