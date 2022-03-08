package test

import myMusic.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlayListTest {

    @Test
    fun thePriceOfAnEmptyPlayListIs0() {
        // Given
        val playList: IArticle = PlayList()

        // When
        val actual = playList.getPrice()

        // Then
        assertEquals(actual, 0.0)
    }

    @Test
    fun thePriceOfAPlayListIsEqualToThePriceOfItsSingleArticle() {
        // Given
        val playList: ContainerArticle = PlayList()
        val musicArticle = MockMusicArticle(5.8)
        playList.add(musicArticle)

        // When
        val actual = playList.getPrice()

        // Then
        assertEquals(actual, 5.8)
    }

    @Test
    fun thePriceOfAPlayListIsEqualToTheSumOfThePricesOfItsArticles() {
        // Given
        val playList: ContainerArticle = PlayList()
        playList.add(MockMusicArticle(5.8))
        playList.add(MockMusicArticle(6.2))
        playList.add(MockMusicArticle(2.0))

        // When
        val actual = playList.getPrice()

        // Then
        assertEquals(actual, 14.0)
    }

    @Test
    fun theSizeOfAnEmptyPlayListIs0() {
        // Given
        val playList: IArticle = PlayList()

        // When
        val actual = playList.getSize()

        // Then
        assertEquals(actual, 0.0)
    }

    @Test
    fun theSizeOfAPlayListIsEqualToThePriceOfItsSingleArticle() {
        // Given
        val playList: ContainerArticle = PlayList()
        val musicArticle = MockMusicArticle(size = 5.8)
        playList.add(musicArticle)

        // When
        val actual = playList.getSize()

        // Then
        assertEquals(actual, 5.8)
    }

    @Test
    fun theSizeOfAPlayListIsEqualToTheSumOfThePricesOfItsArticles() {
        // Given
        val playList: ContainerArticle = PlayList()
        playList.add(MockMusicArticle(size = 5.8))
        playList.add(MockMusicArticle(size = 6.2))
        playList.add(MockMusicArticle(size = 2.0))

        // When
        val actual = playList.getSize()

        // Then
        assertEquals(actual, 14.0)
    }
}