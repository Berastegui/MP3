package myMusic

class MP3(
    private val name: String,
    private val size: Double
): IMusicArticle {
    override fun getPrice() = size / 10
    override fun getSize() = size
}