package com.choongang;

import java.nio.charset.CoderResult;
import java.util.Arrays;

public class H_GetLongestWord {
    public String getLongestWord(String str) {
        // TODO:문자열을 입력받아 문자열에서 가장 긴 단어를 리턴해야 합니다.
String MaxLengthStr = "";
String[] words = str.split(" ");
//str -> 순회하기 위해서 문자열 배열로 변환
        // 동일한 문자열일때 같거나 작다고 부등호를 바꾸면 나중걸로 바뀜

        for (String word : words) {
           //긴 단어찾기, 변환한 단어 배열의 단어의 각각 글자길이
           if (MaxLengthStr.length() < word.length()) {
               MaxLengthStr = word;

           }
       }
        return MaxLengthStr;
    }
}
