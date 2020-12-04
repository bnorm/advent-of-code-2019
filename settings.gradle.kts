rootProject.name = "advent-of-code-2019"

include(":util")
for (i in 1..1) {
    include(":day-${i.toString().padStart(2, '0')}")
}
