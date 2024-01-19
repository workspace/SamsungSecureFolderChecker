# Introduction
I suspected that additional information might be included in the intent used to launch the app. Through debugging, I discovered that a bundle named `activity_options` is passed as this additional information.

While investigating the values in this bundle, I found that the key `android:activity.packageName` contains the value `com.samsung.knox.securefolder`.

```kotlin
// Activity
val packageName = intent.getBundleExtra("activity_options")
  ?.getString("android:activity.packageName", "empty")
  ?: "empty"
```

<img width="563" alt="image" src="https://github.com/workspace/SamsungSecureFolderChecker/assets/7759511/41ad2ed3-9ff4-42d7-90bf-1a3e310336db">

`android:activity.packageName` is defined in the `ActivityOptions.java` file under the name `KEY_PACKAGE_NAME`. As indicated in the description, the value for this key represents the package that created these options, which allows us to understand that the app was launched from `Secure Folder`.

# Screenshots 📱
|Default|Secure Folder|
|---|---|
|![Screen_Recording_20240119_175026_samsung-secure-folder-checker_1](https://github.com/workspace/SamsungSecureFolderChecker/assets/7759511/276de31b-dbbe-4eb8-a276-a6001479c310)|![VideoEditor_20240119_054935_1](https://github.com/workspace/SamsungSecureFolderChecker/assets/7759511/834c57e7-a278-4ad6-b0bf-ed54208d08f0)|

# Warning ⚠️
This is a fact discovered through reverse engineering, and it may not function correctly following future updates to `Secure Folder.
