// 186 choshinyoung
var c=new DiscordSocketClient();c.LoginAsync(TokenType.Bot,"토큰");
c.MessageReceived+=(m)=>m.Channel.SendMessageAsync(m.Content=="!ping"?"ping":"");
c.StartAsync();await Task.Delay(-1);