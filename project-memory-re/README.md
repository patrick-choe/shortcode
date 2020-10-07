# Memory

현재 자신의 컴퓨터의 메모리를 출력하기 (MB)

출력 형식
```
(현재 사용 중인 메모리)MB / (전체 메모리)MB
```

예제 출력
```
6961.71MB / 8066.21MB
```

단, 소수점은 2자리까지만 표시한다.

예제 코드

JavaScript 111자

```js
o=require('os'),c=a=>(a/(1024*1024)).toFixed(2),t=c(o.totalmem());console.log(`${t-c(o.freemem())}MB / ${t}MB`)
```

Python 103자

```py
import psutil
r=psutil.virtual_memory()
e=1024*1024
print(f'{round(r[3]/e,2)}MB / {round(r[0]/e,2)}MB')
```

C# 149자

```csharp
var c=new ComputerInfo();Write($"{Format("{0:0.00}",c.AvailablePhysicalMemory/1000000f)}MB / {Format("{0:0.00}",c.TotalPhysicalMemory/1000000f)}MB");
```

## 가장 짧은 코드

`Python` 99자

```py
import psutil;r=psutil.virtual_memory();e=2**20;z=round;print(f'{z(r[3]/e,2)}MB / {z(r[0]/e,2)}MB')
```