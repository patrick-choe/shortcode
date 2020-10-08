# Create Class

`waClass`라는 클래스를 만들고 인수를 받은 후 hi라는 함수가 사용되면 `(인수), 샌즈.`를 출력한다

## 출력 형식
```
(인수), 샌즈.
```

## 예제 출력
```
시녕, 샌즈.
```

## 예제 코드

JavaScript

```js
class waClass {
    constructor(a) {
        this.a = a
    }

    hi() {
        console.log(`${this.a}, 샌즈.`)
    }
}
```

Python

```py
class waClass:
    def __init__(self, a):
        self.a = a
    
    def hi(self):
        print(f'{self.a}, 샌즈.')
```

## 가장 짧은 코드

`Kotlin` 54자

```kotlin
class waClass(var a:String){fun hi()=print("$a, 샌즈.")}
```
