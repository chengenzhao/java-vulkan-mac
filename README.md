# Java Vulkan Example  

# Requirement:  

* Java 22
* Vulkan macOS version should be installed, you may get Vulkan SDK here: https://vulkan.lunarg.com/sdk/home
* Make sure set up the environment after installation, typically in your .zshrc you may need following variables:
```text
export JAVA_HOME=~/JDK/jdk-22.jdk/Contents/Home
export VULKAN_SDK=~/VulkanSDK/1.3.275.0/macOS
export PATH=$JAVA_HOME/bin:$VULKAN_SDK/bin:$PATH
export DYLD_LIBRARY_PATH=$VULKAN_SDK/lib:$DYLD_LIBRARY_PATH
export VK_ICD_FILENAMES=$VULKAN_SDK/share/vulkan/icd.d/MoltenVK_icd.json
export VK_LAYER_PATH=$VULKAN_SDK/share/vulkan/explicit_layer.d
```

# SDK Versions 

* Java SDK(JDK) 22
* VulkanSDK 1.3.275.0

# How to build it?

* (Optional, project has already generated java files) Using jextract to generate corresponding java files of vulkan.h, jextract command(in your $VulkanSDK directory): 
```text
 ~/JDK/jextract-22/bin/jextract -I "./include" -D "VK_USE_PLATFORM_MACOS_MVK" -D "VK_USE_PLATFORM_METAL_EXT" -D "_MACOS" -t org.vulkan ./include/vulkan/vulkan.h
```
* Make sure the path of the lib folder in Vulkan SDK is included in java.library.path, otherwise it won't be able to find it.
* Also files in the share fold is required, make sure the path includes VK_ICD_FILENAMES and VK_LAYER_PATH.
* Run the main class: com.example.HelloApplication

# Distribution / Releasing on Steam etc.

For using Vulkan in Java program there are two requirements:

## Following files in the $Vulkan_SDK/macOS/lib should be included in the Java Library Path

1) libMoltenVK.dylib
2) libvulkan.${vk_version}.dylib e.g. libvulkan.1.3.275.dylib
3) libvulkan.1.dylib
4) libvulkan.dylib

### Choose one of following options:
* Manually copy above 4 files to $JAVA_HOME/lib directory.    
or
* Using Java program argument add $Vulkan_SDK/macOS/lib to the java.library.path, check the following Swift code.

## Setting environment variables is also required
Manually typing in export environment variables for development is OK, but could be difficult for production environment e.g. releasing on Steam.  
Traditionally we could write a script like zsh script or shell script to set the environment variables first then start the Java program using java command.  
However with tools provided by Apple, we could use Swift to do the similar job.
A typical Swift wrapper code like:
```swift
import Foundation

let task = Process()

let currentPath = FileManager.default.currentDirectoryPath

//envorinment varaibles
task.environment = [
    "VK_DRIVER_FILES":"\(currentPath)/share/vulkan/icd.d/MoltenVK_icd.json",
    "VK_LAYER_PATH":"\(currentPath)/share/vulkan/explicit_layer.d"
]
//path to your JAVA_HOME/bin/java
task.launchPath = "\(currentPath)/bin/java"
//options, main class and arugments
let moduleName = "demo"
let mainClass = "com.example.HelloApplication"
let jarName = "demo.jar"
//-Djava.library.path also goes here e.g. ["-Djava.library.path=\(vulkanSDKLibPath)",...
task.arguments = ["--enable-native-access=\(moduleName)","-p","\(jarName)","-m","\(moduleName)/\(mainClass)"]

task.standardInput = nil
task.launch()

task.waitUntilExit()
```
compile it, then you will get a starting binary executable file which could be used in Steam launch options.
