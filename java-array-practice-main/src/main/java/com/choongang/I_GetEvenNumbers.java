package com.choongang;

import java.util.Arrays;

import static java.util.Arrays.*;

public class I_GetEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        // TODO:int 타입를 요소로 갖는 배열을 입력받아 짝수만을 요소로 갖는 배열을 리턴해야 합니다.
        //짝수가 몇개이ㅣㄴ지 찾고 배열 만듬 (두번 순회)
        // 배열 수가 다를때
     int[] evenArray;
     int count = 0;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] %2 == 0){
             count++;
         }
     }
     evenArray = new int[count];
     // arr=[1,2,3,4}
        //evenArray=[0,0]
     count = 0; //다른 변수명 써도 됨

     for (int i = 0; i < arr.length; i++ ){
         if (arr[i] %2 == 0) {
             evenArray[count] = arr[i] ;
             count++;//짝수이면 요소로 바꿈
         }
     }
return evenArray;
    }
}

