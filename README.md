# Java Vulkan Example  

![Screenshot2024-03-31 18 19 12](https://github.com/chengenzhao/java-vulkan-mac/assets/5525436/7ff3454b-cde6-468c-9e27-72900bd08667)

# Requirement:  

* Java 22
* Vulkan macOS version should be installed, you may get Vulkan SDK here: https://vulkan.lunarg.com/sdk/home
* Make sure set up the environment after installation, typically in your .zshrc you may need following variables:
```shell
export JAVA_HOME=~/JDK/jdk-22.jdk/Contents/Home
export VULKAN_SDK=~/VulkanSDK/1.3.280.1/macOS
export PATH=$JAVA_HOME/bin:$VULKAN_SDK/bin:$PATH
export DYLD_LIBRARY_PATH=$VULKAN_SDK/lib:$DYLD_LIBRARY_PATH
export VK_ICD_FILENAMES=$VULKAN_SDK/share/vulkan/icd.d/MoltenVK_icd.json
export VK_LAYER_PATH=$VULKAN_SDK/share/vulkan/explicit_layer.d
```

# SDK Versions 

* Java SDK(JDK) 22
* VulkanSDK 1.3.280.1

# How to run it?
* Install Vulkan SDK, make sure the environment variables are set.
* Run the main class: com.example.HelloApplication.
![Screenshot2024-04-02 17 11 26](https://github.com/chengenzhao/java-vulkan-mac/assets/5525436/dafef8ea-421f-4408-a7d4-32013a1e2435)

# How to generate vulkan_h.java and compile the shaders? 
There are some generated source code and compiled shaders in the src directory, here is the way I made them:
* Using jextract to generate corresponding java files of vulkan.h, jextract command(in your $VulkanSDK directory): 
```shell
$jextract/bin/jextract -I "./include" -D "VK_USE_PLATFORM_MACOS_MVK" -D "VK_USE_PLATFORM_METAL_EXT" -D "_MACOS" -t org.vulkan $VULKAN_SDK/include/vulkan/vulkan.h
```
* Compile the shader files, which included in the src/main/resources/shader folder. Using command like:
```shell
$VULKAN_SDK/bin/glslc src/main/resources/shader/shader.vert -o src/main/resources/shader/vert.spv
$VULKAN_SDK/bin/glslc src/main/resources/shader/shader.frag -o src/main/resources/shader/frag.spv
```

# Distribution / Releasing on Steam etc.

For using Vulkan in Java program there are two requirements:

## 1) Following files in the $Vulkan_SDK/macOS/lib should be included in the Java Library Path

1) libMoltenVK.dylib
2) libvulkan.1.3.280.dylib
3) libvulkan.1.dylib
4) libvulkan.dylib

### Choose one of following options:
* (Recommended) Manually copy above 4 files to $JAVA_HOME/lib directory.     

or
* Using option: 
```shell
-Djava.library.path=$VULKAN_SDK/lib
```
check following Swift code.

## 2) Setting environment variables is also required
Manually typing in export environment variables for development is OK, but could be difficult for production environment e.g. releasing on Steam.  
Traditionally we could write a script like zsh script or shell script to set the environment variables first then start the Java program using java command.  
However with tools provided by Apple, we could use Swift to do the similar job.     
A typical Swift wrapper code like:
```swift
import Foundation

let task = Process()

let currentPath = FileManager.default.currentDirectoryPath

//environment variables, make sure copy the share directory in $VULKAN_SDK to the root directory of distribution 
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
//-Djava.library.path also goes here e.g. ["-Djava.library.path=\(vulkanSDKLibPath)/lib",...
task.arguments = ["--enable-native-access=\(moduleName)","-p","\(jarName)","-m","\(moduleName)/\(mainClass)"]

task.standardInput = nil
task.launch()

task.waitUntilExit()
```
Compile it, then you will get a starting binary executable file which could be used in Steam launch options.  
Don't forget copy the share directory in $VULKAN_SDK to the root directory of distribution. 

## 3) Custom Java runtime may also be required.
JavaFX is native dependency thus for distribution, developers need generate custom runtime for it.    
Using jlink and javafx-maven-plugin and javafx:jlink to generate the custom runtime.

# Basic Ideas

https://mail.openjdk.org/pipermail/openjfx-dev/2021-February/028861.html