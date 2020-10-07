# Multiplication table | 구구단

구구단 1단부터 9단까지 출력하시오.

## 예제 출력

```
1 x 1 = 1
1 x 2 = 2

...

5 x 7 = 35

...

9 x 8 = 72
9 x 9 = 81
```

## 가장 짧은 코드

`Kotlin` 55자

```kotlin
for(x in 1..9)for(y in 1..9)println("$x x $y = ${x*y}")
```