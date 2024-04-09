package com.choongang;

public class B_GetLastElement {
    public int getLastElement(int[] arr) {
        // TODO:배열를 입력받아 배열의 마지막 요소를 리턴해야 합니다.
        if ( arr.length == 0){
            return -1;
        }
        return arr[arr.length - 1];
        /*
        if(arr.length ! = 0){
        return arr[arr.length - 1];
        }
        */
    }
}
