package test

import myMusic.IArticle
import myMusic.MockMusicArticle
import myMusic.MyOrder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OrderTest {

    @Test
    fun theTotalPriceOfAnEmptyOrderIs0() {
        // Given
        val order = MyOrder()

        // when
        val actual = order.getPrice()

        // Then
        assertEquals(actual, 0.0)
    }

    @Test
    fun thePriceOfAnOrderWithAnArticleIsThePriceOfTheArticle() {
        // Given
        val order = MyOrder()
        val price = 1.0
        val article: IArticle = MockMusicArticle(price)
        order.add(article)

        // when
        val actual = order.getPrice()

        // Then
        assertEquals(actual, price)
    }

    @Test
    fun thePriceOfAnOrderIsTheSumOfThePricesOfItsArticles() {
        // Given
        val order = MyOrder()
        order.add(MockMusicArticle(1.0))
        order.add(MockMusicArticle(2.0))
        order.add(MockMusicArticle(3.0))

        // when
        val actual = order.getPrice()

        // Then
        assertEquals(actual, 6.0)
    }

    @Test
    fun whenThePromoIsOutsideTheRange() {
        // Given
        val order = MyOrder()
        order.add(MockMusicArticle(1.0))
        order.add(MockMusicArticle(2.0))
        order.add(MockMusicArticle(3.0))
        order.setPromo(1.3)

        // when
        val actual = order.getPrice()

        // Then
        assertEquals(actual, 6.0)
    }

    @Test
    fun whenThePromoIsInsideTheRange() {
        // Given
        val order = MyOrder()
        order.add(MockMusicArticle(1.0))
        order.add(MockMusicArticle(2.0))
        order.add(MockMusicArticle(3.0))
        order.setPromo(0.3)

        // when
        val actual = order.getPrice()

        // Then
        assertEquals(actual, 4.2, 0.001)
    }
}