rootProject.name = "hexagonal-architecture-multi-modules"

val adaptersRootDir = "infrastructure/adapters"

// Includes
include(":core")
include(":server")
include(":database-adapter")
include(":grpc-adapter")
include(":messaging-adapter")
include(":rest-adapter")

// Modules Name
project(":core").projectDir = file("core")
project(":server").projectDir = file("server")
project(":database-adapter").projectDir = file("$adaptersRootDir/database")
project(":grpc-adapter").projectDir = file("$adaptersRootDir/grpc")
project(":messaging-adapter").projectDir = file("$adaptersRootDir/messaging")
project(":rest-adapter").projectDir = file("$adaptersRootDir/rest")
