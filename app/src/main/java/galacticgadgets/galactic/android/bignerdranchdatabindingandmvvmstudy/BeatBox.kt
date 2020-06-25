package galacticgadgets.galactic.android.bignerdranchdatabindingandmvvmstudy

import android.content.res.AssetManager
import android.util.Log
import java.lang.Exception

private const val TAG = "BeatBox"
private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager) {

    val sounds: List<Sound>

    init{
        sounds = loadSounds()
    }

    //get list of assets
    private fun loadSounds(): List<Sound> {

        val soundNames: Array<String>

        try{
            soundNames = assets.list(SOUNDS_FOLDER)!!
        } catch (e: Exception){
            Log.e(TAG, "Could not list assets", e)
            return emptyList()
        }

        val sounds = mutableListOf<Sound>()
        soundNames.forEach { filename ->
            val assetPath = "$SOUNDS_FOLDER/$filename"
            val sound = Sound(assetPath)
            sounds.add(sound)
        }
        return sounds
    }
}