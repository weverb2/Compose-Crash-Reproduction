# Crash Reproduction Steps

1. Run the application in release mode:

    `./gradlew :app:installRelease`

2. Set the compile mode of the app to `verify`

    `adb shell cmd package compile -f -m verify $PACKAGE_NAME`

3. Scroll up and down on the application

4. The application will crash