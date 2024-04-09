package com.choongang;

public class F_GetAllLetters {
    public char[] getAllLetters(String str) {
        // TODO:문자열을 입력받아 문자열을 구성하는 각 문자를 요소로 갖는 배열을 리턴해야 합니다.
    if (str.isEmpty()){
        return new char[]{};
    }
    char[] chars = new char[str.length()]; //문자배열 생성 문자길이만큼 공간 확보
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;

//        char[] chars;
//       chars = str.toCharArray();
//        return chars;
    }
}
