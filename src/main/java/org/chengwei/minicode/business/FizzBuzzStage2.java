package org.chengwei.minicode.business;

public class FizzBuzzStage2 extends FizzBuzzStage1 {

    /**
     * 重写getOutput方法，改成requirement 2的约束逻辑
     * 1.数字中有3或能被3整除则输出“FIZZ”;
     * 2.数字中有5或能被5整除则输出“BUZZ”;
     * 3.数字中有3和5或能被3和5整除则输出“FIZZBUZZ”;
     *
     * @param num       数到的数
     * @param output    输出字符串
     * @return
     */
    @Override
    public StringBuffer getOutput(int num, StringBuffer output) {

        boolean isDivisibleBy3 = super.isDivisibleBy(num, DIVISOR_THREE);
        boolean isDivisibleBy5 = super.isDivisibleBy(num, DIVISOR_FIVE);

        StringBuffer newOutput = new StringBuffer();
        boolean isContains3 = isContainsNumOf(num, DIVISOR_THREE);
        boolean isContains5 = isContainsNumOf(num, DIVISOR_FIVE);

        if (isContains3 || isDivisibleBy3) {
            output.append(super.OUTPUT_STR_ARR[DIVISOR_THREE]);
        }

        if (isContains5 || isDivisibleBy5) {
            output.append(super.OUTPUT_STR_ARR[DIVISOR_FIVE]);
        }

        if (!isDivisibleBy3 && !isDivisibleBy5 && !isContains3 && !isContains5) {
            output = new StringBuffer(Integer.toString(num));
        }
        return output;
    }

    /**
     * 判断数到的数字是否包含特定数字的方法
     *
     * @param num           数到的数
     * @param containNum    需要包含的数字
     * @return
     */
    public boolean isContainsNumOf(int num, int containNum) {

        if (Integer.toString(num).contains(Integer.toString(containNum))) {
            return true;
        }

        return false;
    }
}
