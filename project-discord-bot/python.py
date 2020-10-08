# 130 kiki7000
a=__import__('discord').Client()
@a.event
async def on_message(m):
 if m.content=='!ping':await m.channel.send('pong')
a.run('토큰')