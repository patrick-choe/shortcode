# Discord Bot | 디코봇

가장 짧게 `!ping` 입력하면 `pong` 대답하는 봇 만들기
**토큰은 `토큰`**

## 예제 코드

JavaScript

```js
const Discord = require('discord.js');
const client = new Discord.Client();

client.on('message', msg => {
  if (msg.content === '!ping') {
    msg.reply('pong');
  }
});

client.login('토큰');
```

Python

```py
import discord
client = discord.Client()
    
@client.event
async def on_message(msg):
    if msg.content == 'ping:
        await msg.channel.send('pong!')
      
client.run('토큰')
```

## 가장 짧은 코드

`JavaScript` 107자

```js
(new(require('discord.js').Client)).on('message',m=>m.content=='!ping'&&m.channel.send('pong')).login('토큰')
```