package galacticgadgets.galactic.android.bignerdranchdatabindingandmvvmstudy

import org.junit.Assert.*

import org.hamcrest.CoreMatchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

import org.hamcrest.CoreMatchers.*
import org.mockito.ArgumentMatchers.*
import org.mockito.Mockito.*

@RunWith(MockitoJUnitRunner::class)
class SoundViewModelTest {

    //region Constants


    //endregion Constants

    //region Helper Fields


    //endregion Helper Fields

    private lateinit var beatBox: BeatBox
    private lateinit var sound: Sound
    private lateinit var SUT: SoundViewModel

    @Before
    fun setup() {
        beatBox = mock(BeatBox::class.java)
        sound = Sound("assetPath")
        SUT = SoundViewModel(beatBox)
        SUT.sound = sound
    }

    //tests
    @Test
    fun exposesSoundNameAsTitle(){
        assertThat(SUT.title, `is`(sound.name))
    }

    @Test
    fun callsBeatBoxPlayOnButtonClicked(){
        SUT.onButtonClicked()

        verify(beatBox).play(sound)
    }
    //region Helper Methods


    //endregion Helper Methods


    //region Helper Classes


    //endregion Helper Classes

}