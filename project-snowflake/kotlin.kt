// 234 PatrickKR
// I hate JVM Date system
fun ID2Date(id:Long)=java.time.Instant.ofEpochMilli(id.shr(22)+1420070400000).atZone(java.time.ZoneId.of("Asia/Seoul")).format(java.time.format.DateTimeFormatter.ofPattern("YYYY년 M월 dd일 a h시 m분 s초").withLocale(java.util.Locale.KOREA))
