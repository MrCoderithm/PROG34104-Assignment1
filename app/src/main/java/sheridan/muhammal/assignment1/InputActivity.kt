package sheridan.muhammal.assignment1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sheridan.muhammal.assignment1.databinding.ActivityInputBinding

class InputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendButton.setOnClickListener{showOutput()}

    }

    private fun showOutput(){

        // get the selected message text
        val message = when (binding.messageGroup.checkedRadioButtonId) {
            R.id.rock_button -> getString(R.string.game_rock)
            R.id.paper_button -> getString(R.string.game_paper)
            R.id.scissor_button -> getString(R.string.game_scissor)
            else -> getString(R.string.undefined)
        }

        val intent = Intent(this, OutputActivity::class.java).apply {
            putExtra(OutputActivity.MESSAGE_TEXT_KEY, message)
        }
        startActivity(intent)
    }
}