# Snowflake | 눈송이

디스코드 ID를 이용해 계정 생성 시간(유저)을 출력하시오.

단, 한국 시간으로 리턴해야 한다. (KST Asia/Seoul) (string)
또 함수 이름은 "ID2Date" 으로 해야 한다.
오직 시간 관련 모듈 사용만 가능하고, 직접 숫자인 아이디를 바이트로 나눠서 시간을 출력해야 한다.

## 출력 형식
```
{}년 {}월 {}일 {오후/오전} {}시 {}분 {}초
```

## 예제 출력
```
2020년 9월 30일 오후 6시 58분 2초
```

## 가장 짧은 코드

`JavaScript` 173자

```js
function ID2Date(id){b=(+id).toString(2),h=b.substring(0,42-(64-b.length));return require('moment')(parseInt(h,2)+14200704e5).locale('ko').format('YYYY년 MMM Do a h시 m분 s초')}
```