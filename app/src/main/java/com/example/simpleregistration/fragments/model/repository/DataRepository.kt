package com.example.simpleregistration.fragments.model.repository

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class DataRepository {

    private val db = Firebase.database.reference

    fun getGuidRef() = db.child("Courses").get()

    fun getQuizById(quizId: Int) = db.child("Quizzes").child("id=$quizId").get()

    fun getQuizRef() = db.child("Quizzes")
}
