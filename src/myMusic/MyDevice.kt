package myMusic

class MyDevice(
    private val maxSize: Double = 0.0,
    private val basePrice: Double
): ContainerArticle() {

    override fun add(article: IMusicArticle): Boolean {
        if (maxSize == 0.0 || getSize() + article.getSize() <= maxSize) {
            return super.add(article)
        }
        return false
    }

    override fun getPrice() = super.getPrice() + basePrice
}