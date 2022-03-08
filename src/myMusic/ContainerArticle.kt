package myMusic

abstract class ContainerArticle: IArticle {

    private val articles: MutableList<IMusicArticle> = mutableListOf()

    open fun add(article: IMusicArticle) = articles.add(article)

    override fun getPrice() = articles.sumOf { it.getPrice() }
    override fun getSize()= articles.sumOf { it.getSize() }
}