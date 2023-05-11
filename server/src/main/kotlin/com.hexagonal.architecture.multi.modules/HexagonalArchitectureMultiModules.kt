package com.hexagonal.architecture.multi.modules

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class HexagonalArchitectureMultiModules

fun main(args: Array<String>) {
    runApplication<HexagonalArchitectureMultiModules>(*args)
}
