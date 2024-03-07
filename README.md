# Java Vulkan Example  

# Requirement:  

* Java 22
* Vulkan MacOS should be installed, you may get Vulkan SDK here: https://vulkan.lunarg.com/sdk/home
* (Optional, project has already have generated java files) Using jextract to generate corresponding java files of vulkan.h, jextract command(in your $pathToVulkanSDK/$version/macOS/ directory): 
```text
 ~/JDK/jextract-22/bin/jextract -I "./include" -D "VK_USE_PLATFORM_MACOS_MVK" -D "VK_USE_PLATFORM_METAL_EXT" -D "_MACOS" -t org.vulkan ./include/vulkan/vulkan.h
```
* make sure the path of the lib folder in Vulkan SDK is included in java.library.path, otherwise it won't be able to find it.
* run the main class: com.example.HelloApplication