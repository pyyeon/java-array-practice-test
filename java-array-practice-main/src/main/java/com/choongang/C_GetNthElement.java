package com.choongang;

public class C_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        // TODO:배열과 수를 입력받아 수가 인덱스로 가리키는 배열의 요소를 리턴해야 합니다.
        if (arr.length == 0) {
            return -1;
        }
        else if (arr.length - 1 < index) {
            return -2;
        }
        else return arr[index];
    }
}
