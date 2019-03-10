package org.chengwei.minicode.business;

public class FizzBuzzStage2 extends FizzBuzzStage1 {

    /**
     * 重写getOutput方法，加入requirement 2的约束逻辑
     * 1.数字中有3则输出“FIZZ”;
     * 2.数字中有5则输出“BUZZ”;
     * 3.数字中有3和5则输出“FIZZBUZZ”;
     *
     * @param num       数到的数
     * @param output    输出字符串
     * @return
     */
    @Override
    public StringBuffer getOutput(int num, StringBuffer output) {
        output = super.getOutput(num, output);

        StringBuffer newOutput = new StringBuffer();
        boolean isContains3 = isContainsNumOf(num, newOutput, 3);
        boolean isContains5 = isContainsNumOf(num, newOutput, 5);
        if (!isContains3 && !isContains5) {
            return output;
        }
        return newOutput;
    }

    /**
     * 判断数到的数字是否包含特定数字的方法
     *
     * @param num           数到的数
     * @param output        输出字符串
     * @param containNum    需要包含的数字
     * @return
     */
    public boolean isContainsNumOf(int num, StringBuffer output, int containNum) {

        if (Integer.toString(num).contains(Integer.toString(containNum))) {
            output.append(super.OUTPUT_STR_ARR[containNum]);
            return true;
        }

        return false;
    }
}
