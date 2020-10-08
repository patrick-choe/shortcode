// 102 PatrickKR
print(Regex("(?<=c=\").*?(?=\")").find(java.net.URL("https://userwiki.xyz/battle").readText())?.value)
