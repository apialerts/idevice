package com.apialerts.idevice

/**
 * Returns the name of the Apple device based on the device code.
 * @param code The device code.
 * @return The name of the Apple device or null if the device code is not found.
 */
fun appleDeviceName(code: String): String? {
    return when (code) {
        // iPod Touch
        "iPod5,1" -> "iPod touch (5th generation)"
        "iPod7,1" -> "iPod touch (6th generation)"
        "iPod9,1" -> "iPod touch (7th generation)"

        // iPhone
        "iPhone3,1", "iPhone3,2", "iPhone3,3" -> "iPhone 4"
        "iPhone4,1" -> "iPhone 4s"
        "iPhone5,1", "iPhone5,2" -> "iPhone 5"
        "iPhone5,3", "iPhone5,4" -> "iPhone 5c"
        "iPhone6,1", "iPhone6,2" -> "iPhone 5s"
        "iPhone7,2" -> "iPhone 6"
        "iPhone7,1" -> "iPhone 6 Plus"
        "iPhone8,1" -> "iPhone 6s"
        "iPhone8,2" -> "iPhone 6s Plus"
        "iPhone8,4" -> "iPhone SE"
        "iPhone9,1", "iPhone9,3" -> "iPhone 7"
        "iPhone9,2", "iPhone9,4" -> "iPhone 7 Plus"
        "iPhone10,1", "iPhone10,4" -> "iPhone 8"
        "iPhone10,2", "iPhone10,5" -> "iPhone 8 Plus"
        "iPhone10,3", "iPhone10,6" -> "iPhone X"
        "iPhone11,2" -> "iPhone XS"
        "iPhone11,4", "iPhone11,6" -> "iPhone XS Max"
        "iPhone11,8" -> "iPhone XR"
        "iPhone12,1" -> "iPhone 11"
        "iPhone12,3" -> "iPhone 11 Pro"
        "iPhone12,5" -> "iPhone 11 Pro Max"
        "iPhone12,8" -> "iPhone SE (2nd generation)"
        "iPhone13,1" -> "iPhone 12 mini"
        "iPhone13,2" -> "iPhone 12"
        "iPhone13,3" -> "iPhone 12 Pro"
        "iPhone13,4" -> "iPhone 12 Pro Max"
        "iPhone14,2" -> "iPhone 13 Pro"
        "iPhone14,3" -> "iPhone 13 Pro Max"
        "iPhone14,4" -> "iPhone 13 mini"
        "iPhone14,5" -> "iPhone 13"
        "iPhone14,6" -> "iPhone SE (3rd generation)"
        "iPhone14,7" -> "iPhone 14"
        "iPhone14,8" -> "iPhone 14 Plus"
        "iPhone15,2" -> "iPhone 14 Pro"
        "iPhone15,3" -> "iPhone 14 Pro Max"
        "iPhone15,4" -> "iPhone 15"
        "iPhone15,5" -> "iPhone 15 Plus"
        "iPhone16,1" -> "iPhone 15 Pro"
        "iPhone16,2" -> "iPhone 15 Pro Max"
        "iPhone17,1" -> "iPhone 16 Pro"
        "iPhone17,2" -> "iPhone 16 Pro Max"
        "iPhone17,3" -> "iPhone 16"
        "iPhone17,4" -> "iPhone 16 Plus"
        "iPhone17,5" -> "iPhone 16e"
        "iPhone18,3" -> "iPhone 17"
        "iPhone18,1" -> "iPhone 17 Pro"
        "iPhone18,2" -> "iPhone 17 Pro Max"
        "iPhone18,4" -> "iPhone Air"

        // iPad
        "iPad2,1", "iPad2,2", "iPad2,3", "iPad2,4" -> "iPad 2"
        "iPad3,1", "iPad3,2", "iPad3,3" -> "iPad (3rd generation)"
        "iPad3,4", "iPad3,5", "iPad3,6" -> "iPad (4th generation)"
        "iPad6,11", "iPad6,12" -> "iPad (5th generation)"
        "iPad7,5", "iPad7,6" -> "iPad (6th generation)"
        "iPad7,11", "iPad7,12" -> "iPad (7th generation)"
        "iPad11,6", "iPad11,7" -> "iPad (8th generation)"
        "iPad12,1", "iPad12,2" -> "iPad (9th generation)"
        "iPad13,18", "iPad13,19" -> "iPad (10th generation)"
        "iPad15,7", "iPad15,8" -> "iPad (A16)"

        // iPad Air
        "iPad4,1", "iPad4,2", "iPad4,3" -> "iPad Air"
        "iPad5,3", "iPad5,4" -> "iPad Air 2"
        "iPad11,3", "iPad11,4" -> "iPad Air (3rd generation)"
        "iPad13,1", "iPad13,2" -> "iPad Air (4th generation)"
        "iPad13,16", "iPad13,17" -> "iPad Air (5th generation)"
        "iPad14,8", "iPad14,9" -> "iPad Air (11-inch) (M2)"
        "iPad14,10", "iPad14,11" -> "iPad Air (13-inch) (M2)"
        "iPad15,3", "iPad15,4" -> "iPad Air (11-inch) (M3)"
        "iPad15,5", "iPad15,6" -> "iPad Air (13-inch) (M3)"

        // iPad Mini
        "iPad2,5", "iPad2,6", "iPad2,7" -> "iPad Mini"
        "iPad4,4", "iPad4,5", "iPad4,6" -> "iPad Mini 2"
        "iPad4,7", "iPad4,8", "iPad4,9" -> "iPad Mini 3"
        "iPad5,1", "iPad5,2" -> "iPad Mini 4"
        "iPad11,1", "iPad11,2" -> "iPad Mini (5th generation)"
        "iPad14,1", "iPad14,2" -> "iPad Mini (6th generation)"
        "iPad16,1", "iPad16,2" -> "iPad Mini (A17 Pro)"

        // iPad Pro
        "iPad6,3", "iPad6,4" -> "iPad Pro (9.7-inch)"
        "iPad6,7", "iPad6,8" -> "iPad Pro (12.9-inch)"
        "iPad7,1", "iPad7,2" -> "iPad Pro (12.9-inch) (2nd generation)"
        "iPad7,3", "iPad7,4" -> "iPad Pro (10.5-inch)"
        "iPad8,1", "iPad8,2", "iPad8,3", "iPad8,4" -> "iPad Pro (11-inch)"
        "iPad8,5", "iPad8,6", "iPad8,7", "iPad8,8" -> "iPad Pro (12.9-inch) (3rd generation)"
        "iPad8,9", "iPad8,10" -> "iPad Pro (11-inch) (2nd generation)"
        "iPad8,11", "iPad8,12" -> "iPad Pro (12.9-inch) (4th generation)"
        "iPad13,4", "iPad13,5", "iPad13,6", "iPad13,7" -> "iPad Pro (11-inch) (3rd generation)"
        "iPad13,8", "iPad13,9", "iPad13,10", "iPad13,11" -> "iPad Pro (12.9-inch) (5th generation)"
        "iPad14,3", "iPad14,4" -> "iPad Pro (11-inch) (4th generation)"
        "iPad14,5", "iPad14,6" -> "iPad Pro (12.9-inch) (6th generation)"
        "iPad16,3", "iPad16,4" -> "iPad Pro (11-inch) (M4)"
        "iPad16,5", "iPad16,6" -> "iPad Pro (13-inch) (M4)"

        // HomePod
        "AudioAccessory1,1" -> "HomePod"
        "AudioAccessory5,1" -> "HomePod mini"

        // Apple TV
        "AppleTV5,3" -> "Apple TV HD"
        "AppleTV6,2" -> "Apple TV 4K"
        "AppleTV11,1" -> "Apple TV 4K (2nd generation)"
        "AppleTV14,1" -> "Apple TV 4K (3rd generation)"

        // Apple Watch
        "Watch1,1" -> "Apple Watch (1st generation) 38mm"
        "Watch1,2" -> "Apple Watch (1st generation) 42mm"
        "Watch2,6" -> "Apple Watch Series 1 38mm"
        "Watch2,7" -> "Apple Watch Series 1 42mm"
        "Watch2,3" -> "Apple Watch Series 2 38mm"
        "Watch2,4" -> "Apple Watch Series 2 42mm"
        "Watch3,1", "Watch3,3" -> "Apple Watch Series 3 38mm"
        "Watch3,2", "Watch3,4" -> "Apple Watch Series 3 42mm"
        "Watch4,1", "Watch4,3" -> "Apple Watch Series 4 40mm"
        "Watch4,2", "Watch4,4" -> "Apple Watch Series 4 44mm"
        "Watch5,1", "Watch5,3" -> "Apple Watch Series 5 40mm"
        "Watch5,2", "Watch5,4" -> "Apple Watch Series 5 44mm"
        "Watch5,9", "Watch5,11" -> "Apple Watch SE 40mm"
        "Watch5,10", "Watch5,12" -> "Apple Watch SE 44mm"
        "Watch6,1", "Watch6,3" -> "Apple Watch Series 6 40mm"
        "Watch6,2", "Watch6,4" -> "Apple Watch Series 6 44mm"
        "Watch6,6", "Watch6,8" -> "Apple Watch Series 7 41mm"
        "Watch6,7", "Watch6,9" -> "Apple Watch Series 7 45mm"
        "Watch6,10", "Watch6,12" -> "Apple Watch SE (2nd generation) 40mm"
        "Watch6,11", "Watch6,13" -> "Apple Watch SE (2nd generation) 44mm"
        "Watch6,14", "Watch6,16" -> "Apple Watch Series 8 41mm"
        "Watch6,15", "Watch6,17" -> "Apple Watch Series 8 45mm"
        "Watch6,18" -> "Apple Watch Ultra"
        "Watch7,3" -> "Apple Watch Series 9 41mm"
        "Watch7,4" -> "Apple Watch Series 9 45mm"
        "Watch7,5" -> "Apple Watch Ultra2"
        "Watch7,8", "Watch7,10" -> "Apple Watch Series 10 42mm"
        "Watch7,9", "Watch7,11" -> "Apple Watch Series 10 46mm"
        "Watch7,12" -> "Apple Watch Ultra 3"
        "Watch7,17", "Watch7,19" -> "Apple Watch Series 11 42mm"
        "Watch7,18", "Watch7,20" -> "Apple Watch Series 11 46mm"

        // Simulators
        "i386", "x86_64", "arm64" -> "Simulator"

        else -> null
    }
}

fun isIPhone(code: String): Boolean = code.startsWith("iPhone")
fun isIPad(code: String): Boolean = code.startsWith("iPad")
fun isIPodTouch(code: String): Boolean = code.startsWith("iPod")
fun isAppleWatch(code: String): Boolean = code.startsWith("Watch")
fun isAppleTV(code: String): Boolean = code.startsWith("AppleTV")
fun isHomePod(code: String): Boolean = code.startsWith("AudioAccessory")
fun isSimulator(code: String): Boolean = code in listOf("i386", "x86_64", "arm64")