package org.aj.astra

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
