# 🔥 Algorithm 🔥

### 💻 Contents
- ✅ [Jungol](http://jungol.co.kr/bbs/board.php?bo_table=pbank)
- 👨🏼‍💻 [Algorithm Lecture](https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84#curriculum)
- 👨🏼‍💻 [Baekjoon](https://www.acmicpc.net/step)
- ⬜ [Programmers](https://programmers.co.kr/learn/challenges)

<br>

### 강의 내 메소드 정리

---
<details>
<summary>Character</summary>
<div markdown="1">       

- '0' ~ '9'
    - 48 <= c <= 57
- 'A' ~ 'Z'
    - 65 <= c <= 90
- 'a' ~ 'z'
    - 97 <= c <= 122
- `Character.toUpperCase(c)`
  - c를 대문자로 변형
- `Character.toLowerCase(c)`
  - c를 소문자로 변형
- `Character.isLetter(c)`
  - c가 문자인지 판별
- `Character.isAlphabetic(c)`
  - c가 알파벳인지 판별
- `Character.isDigit(c)`
  - c가 숫자인지 판별

</div>
</details>

<details>
<summary>String</summary>
<div markdown="1">       

- `toCharArray(str)`
  - 문자열을 문자배열로 변형
  - return char []
- `charAt(index)`
  - 문자열 내 해당 index에 있는 문자
  - return char
- `indexOf(searchValue)`
  - 0부터 시작해서 searchValue가 처음으로 발견된 index를 반환
  - 찾지 못하면 -1 반환
  - return int
- `substring(begin)`
  - begin부터 마지막까지 쭉
  - return String
- `substring(begin, end)`
  - begin 부터 end 전까지
  - return String
- `toString()`
  - Object를 String으로 변환
  - NPE 발생 가능
  - return String
- `String.valueOf()`
  - Object를 String으로 변환
  - null일 경우 "null"이라는 문자열로 반환
  - return String
- `split(regex)`
  - regex를 기준으로 문자열을 쪼갬
  - return String []
- `matches(regex)`
  - 문자열이 해당 정규표현식 regex에 부합하는지 판별
  - return Boolean
- `join(delim, array)`
  - 문자 array를 delim을 사이에두고 이어붙임
  - return String
- `s.equalsIgnoreCase(str)`
  - 대소문자를 구분하지 않고 str과 s가 동일한지 판별
  - return Boolean
- `replaceAll(regex, 변형할문자)`
  - 문자열 내 regex에 부합하는 모든 문자를 변형할문자로 변환
  - return String
- `StringBuilder(str).reverse().toString()`
  - str의 문자열을 거꾸로 뒤집는다
  - return String
</div>
</details>