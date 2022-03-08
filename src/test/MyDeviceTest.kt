package test

import myMusic.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MyDeviceTest {

    @Test
    fun thePriceOfAnEmptyMyDeviceIsTheBasePrice() {
        // Given
        val myDevice: IArticle = MyDevice(basePrice = 1.3)

        // When
        val actual = myDevice.getPrice()

        // Then
        assertEquals(actual, 1.3)
    }

    @Test
    fun thePriceOfAMyDeviceIsEqualToThePriceOfItsSingleArticlePlusTheBasePrice() {
        // Given
        val myDevice: ContainerArticle = MyDevice(basePrice = 2.5)
        val musicArticle = MockMusicArticle(5.8)
        myDevice.add(musicArticle)

        // When
        val actual = myDevice.getPrice()

        // Then
        assertEquals(actual, 8.3)
    }

    @Test
    fun thePriceOfAMyDeviceIsEqualToTheSumOfThePricesOfItsArticlesPlusTheBasePrice() {
        // Given
        val myDevice: ContainerArticle = MyDevice(basePrice = 1.6)
        myDevice.add(MockMusicArticle(5.8))
        myDevice.add(MockMusicArticle(6.2))
        myDevice.add(MockMusicArticle(2.0))

        // When
        val actual = myDevice.getPrice()

        // Then
        assertEquals(actual, 15.6)
    }

    @Test
    fun whenTheSizeIsBigEnoughItAddsTheArticle() {
        val myDevice: ContainerArticle = MyDevice(maxSize = 50.0, basePrice = 1.0)
        val musicArticle = MockMusicArticle(size = 5.8)

        // When
        val actual = myDevice.add(musicArticle)

        // Then
        assertTrue(actual)
    }

    @Test
    fun whenTheSizeIsNotBigEnoughItDoesNotAddTheArticle() {
        val myDevice: ContainerArticle = MyDevice(maxSize = 5.0, basePrice = 1.0)
        val musicArticle = MockMusicArticle(size = 5.8)


        // When
        val actual = myDevice.add(musicArticle)

        // Then
        assertFalse(actual)
    }

    @Test
    fun itAddsOnlyTheFirstArticles() {
        val myDevice: ContainerArticle = MyDevice(maxSize = 10.0, basePrice = 1.0)
        val musicArticle1 = MockMusicArticle(size = 5.8)
        val musicArticle2 = MockMusicArticle(size = 3.8)
        val musicArticle3 = MockMusicArticle(size = 2.9)

        // When / Then
        assertTrue(myDevice.add(musicArticle1))
        assertTrue(myDevice.add(musicArticle2))
        assertFalse(myDevice.add(musicArticle3))

    }
}