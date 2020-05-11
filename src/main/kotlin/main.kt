import com.galaktionov.firstandroidapp.dto.Location
import com.galaktionov.firstandroidapp.dto.Post
import com.google.gson.Gson

infix fun Double.x(that: Double) = Location(lat = this, long = that)

public fun main() {


    val list = prepareList()
    println(Gson().toJson(list))
}

private fun prepareList(): MutableList<Post> = mutableListOf(

    Post(
        1L,
        "Google",
        "Try the best search engine!",
        1523496778000,
        true,
        5,
        1,
        0,
        postTpe = Post.POST_TYPE.ADV,
        advLink = "http://www.google.com",
        companyImg = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/1004px-Google_%22G%22_Logo.svg.png"
    ),
    Post(
        15L,
        "Google",
        "Try the best search engine!",
        1523496778000,
        true,
        5,
        1,
        0,
        postTpe = Post.POST_TYPE.ADV,
        advLink = "http://www.google.com",
        companyImg = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/1004px-Google_%22G%22_Logo.svg.png"
    ),
    Post(
        10L,
        "Google",
        "Try the best search engine!",
        1523496778000,
        true,
        5,
        1,
        0,
        postTpe = Post.POST_TYPE.ADV,
        advLink = "http://www.google.com",
        companyImg = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/1004px-Google_%22G%22_Logo.svg.png"
    )
)