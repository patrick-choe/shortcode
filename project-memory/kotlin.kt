// 248 PatrickKR
// This is the most accurate way to get physical memory without using any external lib / accessing os-specific command
// This might be slightly different from the actual total / using memory

val x=sun.management.ManagementFactoryHelper.getOperatingSystemMXBean()as com.sun.management.OperatingSystemMXBean
val z=x.totalPhysicalMemorySize/10485.76
print("${Math.round(z-x.freePhysicalMemorySize/10485.76)*0.01}MB / ${Math.round(z)*0.01}MB")
