package test

import myMusic.MP3
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MP3Test {

    @Test
    fun thePriceOfAMP3ShouldBe14() {
        // Given
        val mp3 = MP3("monMP3", 14.0)

        // When
        val actual = mp3.getPrice()

        // Then
        assertEquals(actual, 1.4)
    }

    @Test
    fun thePriceOfAMP3ShouldBe23() {
        // Given
        val mp3 = MP3("monMP3", 23.0)

        // When
        val actual = mp3.getPrice()

        // Then
        assertEquals(actual, 2.3)
    }

    @Test
    fun thePriceOfAMP3ShouldBe0() {
        // Given
        val mp3 = MP3("monMP3", 0.0)

        // When
        val actual = mp3.getPrice()

        // Then
        assertEquals(actual, 0.0)
    }

    @Test
    fun theSizeOfAMP3ShouldBe14() {
        // Given
        val mp3 = MP3("monMP3", 14.0)

        // When
        val actual = mp3.getSize()

        // Then
        assertEquals(actual, 14.0)
    }

    @Test
    fun theSizeOfAMP3ShouldBe23() {
        // Given
        val mp3 = MP3("monMP3", 23.0)

        // When
        val actual = mp3.getSize()

        // Then
        assertEquals(actual, 23.0)
    }

    @Test
    fun theSizeOfAMP3ShouldBe0() {
        // Given
        val mp3 = MP3("monMP3", 0.0)

        // When
        val actual = mp3.getSize()

        // Then
        assertEquals(actual, 0.0)
    }
}