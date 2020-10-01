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


        val userhand = intent.getStringExtra(MESSAGE_TEXT_KEY)
        binding.messageText.text = userhand

        //       Paper > Rock
        //       Rock > Scissor
        //       Scissor > Paper

        val list = listOf("Rock","Paper","Scissor")
        val cpuhand = list.random()
        binding.messageText1.text = cpuhand

        if (userhand == cpuhand){
            Toast.makeText(this, "It's a Tie!", Toast.LENGTH_LONG).show()
            binding.messageText2.text = "It's a draw"

        }

        if (userhand.toString() == "Rock")
        {
            if(cpuhand == "Scissor")
            {
                Toast.makeText(this, "Rock Beats Scissors. You Win!", Toast.LENGTH_LONG).show()
                binding.messageText2.text = "You beat the computer!"
            }
            if(cpuhand == "Paper")
            {
                Toast.makeText(this, "Paper Beats Rock. You Loose!", Toast.LENGTH_LONG).show()
                binding.messageText2.text = "Computer has beat you."
            }

        }

        if (userhand.toString() == "Paper" ){
            if(cpuhand == "Scissor")
            {
                Toast.makeText(this, "Scissor Beats Paper. You Loose!", Toast.LENGTH_LONG).show()
                binding.messageText2.text = "Computer has beat you."

            }

            if(cpuhand == "Rock")
            {
                Toast.makeText(this, "Paper Beats Rock. You Win!", Toast.LENGTH_LONG).show()
                binding.messageText2.text = "You beat the computer!"
            }
        }

        if (userhand.toString() == "Scissor")
        {
            if(cpuhand == "Rock")
            {
                Toast.makeText(this, "Rock Beats Scissors. You Loose", Toast.LENGTH_LONG).show()
                binding.messageText2.text = "Computer has beat you."
            }

            if(cpuhand == "Paper")
            {
                Toast.makeText(this, "Scissors Beats Paper. You Win!", Toast.LENGTH_LONG).show()
                binding.messageText2.text = "You beat the computer!"
            }

        }

            // make the close button work
        binding.closeButton.setOnClickListener { finish() }
    }



}
