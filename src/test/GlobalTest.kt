package test

import myMusic.MP3
import myMusic.MyDevice
import myMusic.MyOrder
import myMusic.PlayList
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GlobalTest {
    val music1 = MP3("music1", 9.0)
    val music2 = MP3("music2", 12.0)
    val music3 = MP3("music3", 8.0)

    val playList1 = PlayList()

    val music4 = MP3("music4", 13.0)
    val music5 = MP3("music5", 7.0)

    val playList2 = PlayList()

    val music6 = MP3("music6", 23.0)

    val device = MyDevice(basePrice = 1.8)
    val order = MyOrder()

    @Test
    fun theTotalPriceOfTheOrder() {
        playList1.add(music1)
        playList1.add(music2)
        playList1.add(music3)
        playList2.add(music4)
        playList2.add(music5)
        device.add(playList1)
        device.add(playList2)
        device.add(music6)

        order.add(device)

        // When
        val actual = order.getPrice()

        // Then
        assertEquals(actual, 9.0)
    }
}