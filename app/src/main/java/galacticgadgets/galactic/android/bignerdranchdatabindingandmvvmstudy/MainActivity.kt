package galacticgadgets.galactic.android.bignerdranchdatabindingandmvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import galacticgadgets.galactic.android.bignerdranchdatabindingandmvvmstudy.databinding.ActivityMainBinding
import galacticgadgets.galactic.android.bignerdranchdatabindingandmvvmstudy.databinding.ListItemSoundBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 3)
            adapter = SoundAdapter()
        }
    }

    private inner class SoundHolder(private val binding: ListItemSoundBinding) :
            RecyclerView.ViewHolder(binding.root){

    }

    private inner class SoundAdapter() :
            RecyclerView.Adapter<SoundHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundHolder {
            val binding = DataBindingUtil.inflate<ListItemSoundBinding>(
                layoutInflater,
                R.layout.list_item_sound,
                parent,
                false
            )
            return SoundHolder(binding)
        }

        override fun getItemCount() = 0

        override fun onBindViewHolder(holder: SoundHolder, position: Int) {
            TODO("Not yet implemented")
        }
    }
}