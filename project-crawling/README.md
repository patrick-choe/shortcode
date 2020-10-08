# Crawling | 크롤링

**https://userwiki.xyz/battle** 에 있는 img 태그의 src 속성의 사진 URL을 출력하시오.

**단, 크롤링 없이 직접 URL을 출력할 경우 메시지 삭제 처리(Discord) 또는 거부(Close)**

## 예제 출력
```
https://userwiki.xyz/favicon.ico
```

## 가장 짧은 코드

`Kotlin` 102자

```kotlin
print(Regex("(?<=c=\").*?(?=\")").find(java.net.URL("https://userwiki.xyz/battle").readText())?.value)
```
