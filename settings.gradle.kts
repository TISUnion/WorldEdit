rootProject.name = "worldedit"

include("worldedit-libs")

//include("worldedit-bukkit:adapters:adapter-legacy")
//include("worldedit-bukkit:adapters:adapter-1.17.1")

listOf("core").forEach {
    include("worldedit-libs:$it")
    include("worldedit-$it")
}
//include("worldedit-mod")
include("worldedit-libs:core:ap")

//include("worldedit-core:doctools")
