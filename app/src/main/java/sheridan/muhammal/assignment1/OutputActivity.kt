package sheridan.muhammal.assignment1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import sheridan.muhammal.assignment1.databinding.ActivityOutputBinding


class OutputActivity : AppCompatActivity() {

    companion object{
        const val MESSAGE_TEXT_KEY = "message"
    }

    private lateinit var binding: ActivityOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val hand = intent.getStringExtra(MESSAGE_TEXT_KEY)
        binding.messageText.text = hand

//        if (hand == "Paper") {
//            Toast.makeText(this, hand, Toast.LENGTH_SHORT).show()
//        }

        val list = listOf("Rock","Paper","Scissor")
        val random = list.random()
        Toast.makeText(this, random, Toast.LENGTH_SHORT).show()





        // make the close button work
        binding.closeButton.setOnClickListener { finish() }
    }



}
