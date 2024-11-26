# iDevice

iDevice is a simple no dependency Kotlin library for the JVM that translates Apple device codes into their corresponding device names. 

It is used in the [API Alerts](https://apialerts.com) platform to determine the model name of iOS devices to show in the users' device list.

## Installation

Add the dependency to your Gradle toml file:

```toml
idevice = { module = "com.apialerts:idevice", version = "0.0.2" }
```

or Groovy `build.gradle` file:

```groovy
implementation 'com.apialerts:idevice:0.0.2'
```

Ensure `mavenCentral()` is added to your repository list

## Usage

### iOS App

Create an extension for `UIDevice` in your Swift iOS app to retrieve the device code:

```swift
extension UIDevice {
    func modelName() -> String {
        var systemInfo = utsname()
        uname(&systemInfo)
        let mirror = Mirror(reflecting: systemInfo.machine)

        let identifier = mirror.children.reduce("") { identifier, element in
          guard let value = element.value as? Int8, value != 0 else { return identifier }
          return identifier + String(UnicodeScalar(UInt8(value)))
        }
        return identifier
    }
}
```

Use the extension to get the device model code:

```swift
let model = UIDevice.current.modelName()
```

### Backend (Kotlin/Java API)

Pass the device model code to your backend running a JVM API to decode it into a real device name:

```kotlin
import com.apialerts.idevice.appleDeviceName

val model = appleDeviceName("<device code>")
```

If the device code is in the supported devices lookup table, it returns the device name.

## Updating the Library

The repository needs to be updated when Apple releases new devices. Create a pull request with the new device code and model name to the lookup table in `AppleDevices.kt`.

## Credits

This library is inspired by and credits [DeviceKit](https://github.com/devicekit/DeviceKit).