package com.choongang;

public class D_ComputeSumOfAllElements {
    public int computeSumOfAllElements(int[] arr) {
        // TODO:배열을 입력받아 배열의 모든 요소의 합을 리턴해야 합니다.

        int sum = 0;
       //조건문에서 이미 빈 배열이 걸러짐 -> 초기값으로
        for (int j : arr) {

            sum += j;
        }
        return sum;
    }
}


