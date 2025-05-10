package com.example.memoraizeproject.presentation.screens

sealed class Screens(val route : String) {
    object Home : Screens("home_route")
    object Chatbot : Screens("chatbot_route")
    object Profile : Screens("profile_route")
}