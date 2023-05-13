package com.example.myquizapp

/**
 *
 */
object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_ans"

    fun getQuestions(): ArrayList<Question> {


        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.germany,
            "Argentina", "Russia", "Germany", "India", 3
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?", R.drawable.india,
            "South Korea", "Russia", "Germany", "India", 4
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?", R.drawable.japan,
            "South Korea", "Japan", "Germany", "India", 2
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?", R.drawable.russia,
            "South Korea", "Russia", "Germany", "India", 2
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?", R.drawable.korea,
            "South Korea", "Russia", "Germany", "India", 1
        )
        questionList.add(que5)
        return questionList
    }
}