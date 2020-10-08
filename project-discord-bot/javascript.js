// 107 ditto7890
(new(require('discord.js').Client)).on('message',m=>m.content=='!ping'&&m.channel.send('pong')).login('토큰')