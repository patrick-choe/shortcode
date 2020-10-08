require 'discordrb'
b=Discordrb::Bot.new token:'토큰'
b.message with_text:'!ping' do |e|
e.respond 'pong'
end
b.run