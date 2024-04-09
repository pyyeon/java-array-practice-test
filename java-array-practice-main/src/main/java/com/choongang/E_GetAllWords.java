package com.choongang;

public class E_GetAllWords {
    public String[] getAllWords(String str) {
        // TODO:문자열을 입력받아 문자열을 구성하는 각 단어를 요소로 갖는 배열을 리턴해야 합니다.
        /*if (str.equals(""))
            return  new String[]{};
            */
        //문자열을 비교할때는 equals()
        //new String[]{}; 과 new String[0]; 은 빈 배열
         if (str.isEmpty()){
             return new String[]{}; //toString은 문자열로 바뀜
         }

        return str.split(" ");//regex는 정규표현식
    }

}
