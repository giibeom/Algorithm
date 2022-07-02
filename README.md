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
- `Character.getNumericValue(c)`
  - c의 숫자값을 리턴

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

<details>
<summary>Math</summary>
<div markdown="1">       

- `Math.max(a,b)`
  - a와 b 중 더 큰 값을 반환
  - return int
- `Math.floor(a)`
  - 내림
- `Math.ceil(a)`
  - 올림
- `Math.round(a)`
  - 반올림
- `Math.abs(a)`
  - 절대값

</div>
</details>

<details>
<summary>Map</summary>
<div markdown="1">       

```markdown
Hashmap : O(1) 로 빠르게 접근
Treemap : 정렬을 해야되는 경우 - log(n)
```
```java
HashMap<K, V> map = new HashMap<>();
```

- `map.getOrDefault(key, 디폴트값)`
  - key가 존재하면 해당 key의 value 리턴, key가 null 일 시 디폴트값 리턴
  - return V
- `map.containsKey('A')`
  - map 안에 키들 중 'A'라는 키가 존재하는지 확인
  - return Boolean
- `map.remove('A')`
  - A 키를 삭제하고 A의 Value 였던 값을 반환
  - return V
- `map.size()`
  - map의 사이즈를 반환
  - return int
- `mapA.equls(mapB)`
  - map끼리의 객체 비교

</div>
</details>

<details>

<summary>Set</summary>
<div markdown="1">       

```markdown
중복제거가 필요할때 Set을 사용한다
```
```java 
// 오름차순 정렬
TreeSet<T> Tset = new TreeSet<>();

// 내림차순 정렬
TreeSet<T> Tset = new TreeSet<>(Collections.reverseOrder());
```

- `Tset.add(value)`
  - value값을 추가
- `Tset.remove(value)`
  - value값을 삭제
- `Tset.size()`
  - Set에 저장되어있는 값의 개수 반환
- `Tset.first()`
  - Set에 정렬되어 저장되어있는 값 중 제일 **첫번째** 요소 반환
- `Tset.last()`
  - Set에 정렬되어 저장되어있는 값 중 제일 **마지막** 요소 반환

</div>
</details>


<details>
<summary>Stack</summary>
<div markdown="1">       

```markdown
괄호에 대한 문제는 십중팔구 스택 관련 문제!!
ex) (), [], {} ....

링게임이라고 생각하면 됨 -> First In Last OUT
```
```java 
Stack<String> stack = new Stack<>();
```

- `stack.push(value)`
  - 스택 맨위에 value값을 추가
- `stack.pop()`
  - 맨 위에 쌓여있는 값 제거
  - 제거할 stack이 없을 시 EmptyStackException
  - return 삭제한 값
- `stack.isEmpty()`
  - 스택이 비어있는지 확인
- `stack.firstElement()`
  - 스택의 가장 첫번째 값을 반환
  - `stack.get(0)과 동일`
- `stack.lastElement()`
  - 스택의 가장 마지막번째인 값을 반환
  - `stack.peek()과 동일`

</div>
</details>