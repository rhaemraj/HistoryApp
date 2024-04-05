package com.fluffy.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private lateinit var generateButton: Button
private lateinit var clearButton: Button
private lateinit var ageInput: EditText
private lateinit var resultText: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateButton = findViewById(R.id.generateButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultText = findViewById(R.id.resultText)

        generateButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val Celebrity = when (age) {
                    20 -> "Cameron Boyce passed away at the age of 20. He acted in many loved disney movies and shows."
                    21 -> "Jarad Anthony Higgins known as Juice Wrld was 21 when he died. he was known for rap and Sound cloud music."
                    25 -> "Angus Cloud, known famously for his role in 'Euphoria,' died when he was 25"
                    26 -> "At 26 Mac Miller passed away. He was a rapper, singer, songwriter and record producer."
                    40 -> "Paul Walker age 40 was an icon for car lovers."
                    48 -> "Chris Gauthier died at age 48. He was known for roles such as 'Once upon a time' and 'Eureka'"
                    54 -> "Matthew perry who was known and loved famously for his role in 'Friends' passed away at the age of 54."
                    76 -> "Jimmy Buffet was known for his soft rock music died at 76"
                    82 -> "Dawn wells was known best for her role in sit coms died when she was 82"
                    95 -> "Nelson mandela, the beloved South African president died at the age of 95."
                    else -> null
                }
                val message = if (Celebrity != null) "The celebrity is $Celebrity"
                else "No one found with the age you have entered"
                resultText.text = message

            }else {
                resultText.text = "Invalid entry. Please enter a number between 20 and 100."
            }
            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultText.text = ""
            }
            }
        }
    }