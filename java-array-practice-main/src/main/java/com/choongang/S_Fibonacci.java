package com.choongang;

public class S_Fibonacci {
    public int[] fibonacci(int num) {
        // TODO:수(`num`)를 입력받아 `num`번째까지 총 `num + 1`개의 피보나치 수열을 리턴해야 합니다.
        //0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1입니다. 그 다음 2번째 피보나치 수부터는 바로 직전의 두 피보나치 수의 합으로 정의합니다.
        //arr[n]= arr[n-2]+arr[n-1]
        //피보나치 0은 0 1은 1 (고정값)
        int[] fibo = new int[num + 1];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= num; i++){
            fibo[i] = fibo[i - 2] + fibo[i - 1];

        }
        return fibo;
    }
}
