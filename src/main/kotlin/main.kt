package ru.netology

fun main() {
    val likes = 231

    val correctPronounce = if (likes == 1 || likes % 10 == 1) "Человеку" else if (likes == 11 || likes % 100 == 11) "Людям"
    else "Людям"

    println("Понравилось $likes $correctPronounce")
}