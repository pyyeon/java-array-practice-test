package com.choongang;

public class G_GetLargestElement {
    public int getLargestElement(int[] arr) {
        // TODO:배열을 입력받아 가장 큰 요소를 리턴해야 합니다.
       //가장 큰 요소 찾기
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (maxNumber < arr[i]){
                maxNumber = arr[i];
            }
        }



        return maxNumber;
    }
}
