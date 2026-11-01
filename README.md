# Replica Island

Modernized Android port of the classic side-scrolling platformer **Replica Island** for modern Android devices.

*Original authors: Chris Pruett and Genki Mine (Apache 2.0 License).*

---

## About Replica Island

Replica Island stars the Android robot as its protagonist embarking on a mission to find a mysterious power source. It is a complete 2D action platformer with full art, dialogue, storyline, secret levels, and bosses.

### Enhancements in this modernized release:
- **Modern Build System:** Full Gradle build support (Gradle 8.14+, Android Gradle Plugin 8.11+, Java 17 toolchain).
- **Modern Android Compatibility:** Targets SDK 35 (Android 15+) with full support through Android 17.
- **Sensor Modernization:** Replaced deprecated `TYPE_ORIENTATION` with modern Android `TYPE_GAME_ROTATION_VECTOR` / `TYPE_ROTATION_VECTOR` and `SensorManager.getOrientation()` for smooth tilt controls.
- **Dual Ghost Controls:** Control possessed enemies via device tilt and/or on-screen virtual slider.
- **Fixed Landscape Orientation:** Strictly locked to standard landscape mode without disorienting reverse rotations.
- **Uncompromised Content:** 100% complete original game assets, Japanese translations, and clean code preserved.

---

## Building from Source

```bash
git clone https://github.com/PlayFDroid/replica-island.git
cd replica-island
./gradlew assembleDebug
```

The APK will be generated at `app/build/outputs/apk/debug/app-debug.apk`.

To install onto a connected device via ADB:
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

---

## License

This project is licensed under the Apache License, Version 2.0. See [COPYING](COPYING) for details.
