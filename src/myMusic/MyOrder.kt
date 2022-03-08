package myMusic

class MyOrder {

    private val articles: MutableList<IArticle> = mutableListOf()

    private var promo: Double = 0.0

    fun getPrice(): Double = articles.sumOf { it.getPrice() } * (1 - this.promo)

    fun add(article: IArticle) {
        articles.add(article)
    }

    fun setPromo(promo: Double) {
        if (promo >= 0 && promo < 1) {
            this.promo = promo
        }
    }
}
