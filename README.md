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

* (Optional, project has already have generated java files) Using jextract to generate corresponding java files of vulkan.h, jextract command(in your $pathToVulkanSDK/$version/macOS/ directory): 
```text
 ~/JDK/jextract-22/bin/jextract -I "./include" -D "VK_USE_PLATFORM_MACOS_MVK" -D "VK_USE_PLATFORM_METAL_EXT" -D "_MACOS" -t org.vulkan ./include/vulkan/vulkan.h
```
* Make sure the path of the lib folder in Vulkan SDK is included in java.library.path, otherwise it won't be able to find it.
* Also files in the share fold is required, make sure the path includes VK_ICD_FILENAMES and VK_LAYER_PATH.
* Run the main class: com.example.HelloApplication
