//
//  main.swift
//  launch
//
//  Created by Chengen Zhao on 2024/3/10.
//

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
task.arguments = ["--enable-native-access=\(moduleName)","-p","\(jarName)","-m","\(moduleName)/\(mainClass)"]

task.standardInput = nil
task.launch()

task.waitUntilExit()
