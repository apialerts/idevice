# iDevice

iDevice is a Kotlin library for the JVM that translates Apple device codes into their corresponding device names. This library is useful for applications that need to identify the specific model of an Apple device based on its code.

## Installation

Add the dependency to your Gradle `toml` file:

```toml
idevice = { id = "com.apialerts.idevice", version = "0.0.1" }
```

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
val model = appleDeviceName("<device code>")
```

If the device code is in the supported devices lookup table, it returns the device name.

## Updating the Library

The repository needs to be updated when Apple releases new devices. Create a pull request with the new device code and model name to the lookup table in `AppleDevices.kt`.

## Credits

This library is inspired by and credits [DeviceKit](https://github.com/devicekit/DeviceKit).