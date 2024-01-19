# Introduction
I suspected that additional information might be included in the intent used to launch the app. Through debugging, I discovered that a bundle named `activity_options` is passed as this additional information.

While investigating the values in this bundle, I found that the key `android:activity.packageName` contains the value `com.samsung.knox.securefolder`.

```kotlin
// Activity
val packageName = intent.getBundleExtra("activity_options")
  ?.getString("android:activity.packageName", "empty")
  ?: "empty"
```

# Warning ⚠️
This is a fact discovered through reverse engineering, and it may not function correctly following future updates to Secure Folder.

# Screenshots 📱
|Default|Secure Folder|
|---|---|
|![Screen_Recording_20240119_175026_samsung-secure-folder-checker_1](https://github.com/workspace/SamsungSecureFolderChecker/assets/7759511/276de31b-dbbe-4eb8-a276-a6001479c310)|![VideoEditor_20240119_054935_1](https://github.com/workspace/SamsungSecureFolderChecker/assets/7759511/834c57e7-a278-4ad6-b0bf-ed54208d08f0)|
