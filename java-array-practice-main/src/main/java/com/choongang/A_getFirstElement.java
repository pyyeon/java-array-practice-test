package com.choongang;

public class A_getFirstElement {
    public int getFirstElement(int[] arr) {
        // TODO:배열을 입력받아 배열의 첫번째 요소를 리턴해야 합니다.

        if ( arr.length == 0){
            return -1;
        }

        return arr[0];

    }
}
