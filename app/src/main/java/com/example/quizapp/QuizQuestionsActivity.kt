package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions()
        Log.i("QuestionList size is ", "${questionList.size}")

        for(i in questionList){
            Log.e("Questionss", i.question)
        }

        var currentPosition = 1
        val question : Question = questionList[currentPosition-1]
        progressBar?.progress = currentPosition
        tvProgress?.text = "${currentPosition}/${progressBar?.max}"
        tvQuestion?.text = question.question
        ivFlag?.setImageResource(question.image)
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour



    }
}