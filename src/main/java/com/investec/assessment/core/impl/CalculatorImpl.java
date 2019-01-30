package com.investec.assessment.core.impl;

import com.investec.assessment.core.base.Calculator;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Ndumiso
 * @since 31-Jan-19
 */
public class CalculatorImpl implements Calculator {

    @Override
    public int highestCommonFactor(int[] numbers) {
        Arrays.sort(numbers);
        int maxGcd = (new BigInteger(numbers[0] + "").gcd(new BigInteger(numbers[1] + ""))).intValue();
        for (int i = 1; i < numbers.length - 1; i++) {
            int temp = (new BigInteger(numbers[i] + "").gcd(new BigInteger(numbers[i + 1] + ""))).intValue();
            if (maxGcd < temp)
                maxGcd = temp;
        }
        return maxGcd;
    }

    public static void main(String[] args) {
        System.out.println(new CalculatorImpl().highestCommonFactor(new int[]{1701,3768}));
    }
}
