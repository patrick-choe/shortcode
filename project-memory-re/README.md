# Memory | 메모리

현재 자신의 컴퓨터의 메모리를 출력하기 (MB)

**단, 소수점은 2자리까지만 표시한다.**

## 출력 형식
```
(현재 사용 중인 메모리)MB / (전체 메모리)MB
```

## 예제 출력
```
6961.71MB / 8066.21MB
```

## 예제 코드

JavaScript

```js
const os = require('os')

console.log(`${(os.totalmem() - (os.freemem() / (1024 * 1024))).toFixed(2)}MB / ${(os.totalmem() / (1024 * 1024)).toFixed(2)}MB`)
```

Python

```py
import psutil

memory = psutil.virtual_memory()

print(f'{round(memory[3] / (1024 * 1024), 2)}MB / {round(memory[0] / (1024 * 1024), 2)}MB')
```

C#

```csharp
var c = new ComputerInfo();
Write($"{Format("{0:0.00}", c.AvailablePhysicalMemory / 1000000f)}MB / {Format("{0:0.00}", c.TotalPhysicalMemory / 1000000f)}MB");
```

## 가장 짧은 코드

`Python` 99자

```py
import psutil;r=psutil.virtual_memory();e=2**20;z=round;print(f'{z(r[3]/e,2)}MB / {z(r[0]/e,2)}MB')
```