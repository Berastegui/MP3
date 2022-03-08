package myMusic

class MockMusicArticle(
    private val price: Double = 0.0,
    private val size: Double = 0.0,
): IMusicArticle {
    override fun getPrice() = price
    override fun getSize() = size

}