package ru.netology

fun main() {
    val likes = 2111

    val correctPronounce = if ((likes == 1 || likes % 10 == 1) &&
        !(likes % 100 == 11 || likes == 11)) "Человеку" else "Людям"

    println("Понравилось $likes $correctPronounce")
}