package ru.dobryaki.prime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform