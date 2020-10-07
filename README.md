# 숏코딩;

숏코딩(영어로는 `Golf Coding`)은 말 그대로 **코드의 기능은 같게 하면서 코드를 최대한 짧게 짜는것**입니다;

숏코딩을 하면 코드는 짧아지지만 가독성이나 속도는 떨어질수도 있죠;

숏코딩의 예를 보여주겠습니다;

원본 (Python 154자);
```python
sans = []

def wasans():
    return "wasans"

for i in range(5000):
    sans.append(wasans)

result_func = sans[1234]
result = result_func()
print(result)
```
숏코딩 후 (Python 39자);
```python
print(([lambda:'wasans']*5000)[1234]())
```

근데 가독성이 떨어진다는데 왜 숏코딩을 할까요?;

[차정우 선생님은 이런 말을 하셨습니다;](https://namu.wiki/w/GuguClass)

> 한 줄로 짤 코드를 누가 열 줄로 만들어놨어요? 에러 찾기 힘들게. (잠시 뒤) 코드가 길어서 프로그램만 무거워졌잖습니까? 이러니까 서비스가 버벅대지.

저건 순 헛소리지만 우리는 차정우 선생님을 이어서 긴 코드를 짧은 코드로 만드는 일을 할것입니다(대충 결론은 차정우 선생님을 이어서 어쩌고 저쩌고란 소리);

다양한 숏코딩에 참여하고 싶으면 이 서버로 오세요;

[초대링크](https://discord.gg/7dQTTcA);

## 숏코딩 규칙;
`;`를 이용해서 한 줄에 여러 코드를 작성하는것은 안됩니다;

`;`가 필수가 아닌 프로그래밍 언어는 `;` 를 작성하지 않아도 됩니다;

(안좋은 예);
```javascript
import {sans} from 'sans';console.log(sans)
```
(좋은 예);
```javascript
import {sans} from 'sans'
console.log(sans)
```

`줄바꿈`은 1글자로 취급합니다. 그리고 당연히 공백은 하나당 1글자고요;

꼭 파일은 1개여야 합니다;

모듈은 `ALLOWED_MODULES` 폴더의 언어별 파일에 등록된 모듈만 가능합니다. (ISSUE를 통해 신청 가능);

언어는 `ALLOWED_LANGUAGE.md`에 포함된 언어랑 버전만 사용 가능합니다. (ISSUE를 통해 신청 가능);

Python 같이 탭으로 블록을 구분하는 언어를 사용할때 탭 대신 공백을 사용해도 됩니다

## 프로젝트;
숏코딩 참가는 `PULL REQUEST`로 참가 가능하고 숏코딩 프로젝트 추가 요청은 `ISSUES`를 통해 신청하시면 됩니다;

코드는 위 규칙에 어긋나지 않아야 합니다;