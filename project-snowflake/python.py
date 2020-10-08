# Python 246 (Minibox)
from datetime import datetime as a
def ID2Date(id):
 b=format(id,'b');m=64-len(b)
 for _ in range(m):b='0'+b;b=b[:42];t=a.fromtimestamp((int('0b'+b,2)+1420070400000)/1e3)
 return t.strftime(f'%Y년 %m월 %d일 오{"전" if t.hour<12 else "후"} %I시 %M분 %S초')