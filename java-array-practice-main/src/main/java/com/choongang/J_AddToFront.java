package com.choongang;

public class J_AddToFront {
    public int[] addToFront(int[] arr, int el) {
        // TODO:배열과 요소를 입력받아 주어진 요소를 배열의 맨 앞에 추가하고 해당 배열을 리턴해야 합니다.
        // 배열복사 System.arraycopy()
        //배열 복사해서 배열 만듬, 배열 크기 추가, 맨앞에 받은 요소 넣음
        int[] arr2 = new int[arr.length + 1]; //선언할때는 크기
        System.arraycopy(arr,0,arr2,1, arr.length );
        arr2 [0] = el ;
//        for (int i = 0; i < arr.length; i++){
//            arr2[i + 1] = arr[i];
//        }
    return  arr2;
    }

}
