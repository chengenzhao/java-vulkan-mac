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

# Releasing on Steam etc.

For using Vulkan in Java program, setting environment variables is required.  
Manually typing in export environment variables is OK, but could be difficult for production environment e.g. releasing on Steam.  
Traditionally we could write a script like zsh script or shell script to set the environment variables first then start the Java program using java command.  
However with tools provided by Apple, we could use Swift to do the similar job.
A typical Swift wrapper code like:
```swift
import Foundation

func run() {
    let task = Process()
    
    let currentPath = FileManager.default.currentDirectoryPath
    
    //copy all files in the lib to JAVA_HOME/lib
    //envorinment varaibles
    task.environment = [
        "VK_DRIVER_FILES":"\(currentPath)/share/vulkan/icd.d/MoltenVK_icd.json",
        "VK_LAYER_PATH":"\(currentPath)/share/vulkan/explicit_layer.d"
    ]
    //path to your JAVA_HOME/bin/java
    task.launchPath = "\(currentPath)/bin/java"
    //options, main class and arugments
    task.arguments = ["--enable-native-access=demo","-p","demo.jar","-m","demo/com.example.HelloApplication"]

    task.standardInput = nil
    task.launch()
    
    task.waitUntilExit()
}

run()
```
compile it, then you will get a starting binary executable file which could be useful for the Steam launch options.

# How to build it?

* (Optional, project has already generated java files) Using jextract to generate corresponding java files of vulkan.h, jextract command(in your $VulkanSDK directory): 
```text
 ~/JDK/jextract-22/bin/jextract -I "./include" -D "VK_USE_PLATFORM_MACOS_MVK" -D "VK_USE_PLATFORM_METAL_EXT" -D "_MACOS" -t org.vulkan ./include/vulkan/vulkan.h
```
* Make sure the path of the lib folder in Vulkan SDK is included in java.library.path, otherwise it won't be able to find it.
* Also files in the share fold is required, make sure the path includes VK_ICD_FILENAMES and VK_LAYER_PATH.
* Run the main class: com.example.HelloApplication