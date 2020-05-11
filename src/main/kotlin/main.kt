import com.galaktionov.firstandroidapp.dto.Location
import com.galaktionov.firstandroidapp.dto.Post
import com.google.gson.Gson
import com.sun.jndi.toolkit.url.Uri

infix fun Double.x(that: Double) = Location(lat = this, long = that)

public fun main() {


    val list = prepareList()
    println(Gson().toJson(list))
}

private fun prepareList(): MutableList<Post> = mutableListOf(
    Post(
        1L,
        "Netology",
        "Funny cats!",
        1597796778000,
        true,
        2,
        0,
        1823,
        videoUrl = "https://www.youtube.com/embed/WEkSYw3o5is",
        postTpe = Post.POST_TYPE.VIDEO
    ),
    Post(
        1L,
        "Google",
        "Фестиваль книги",
        1587711778000,
        false,
        20,
        100,
        300,
        "Nevsky Prospect",
        59.932030 x 30.355610,
        postTpe = Post.POST_TYPE.EVENT,
        companyImg = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/1004px-Google_%22G%22_Logo.svg.png"
    ),
    Post(
        1L,
        "Twitter",
        "Twitter post",
        1587796778000,
        false,
        250,
        10,
        111,
        postTpe = Post.POST_TYPE.REPLY,
        companyImg = "https://upload.wikimedia.org/wikipedia/it/0/09/Twitter_bird_logo.png"
    ),
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
        1L,
        "Facebook",
        "Funny cats pt.2 ",
        1587567778000,
        false,
        16,
        12,
        3,
        null,
        null,
        videoUrl = "https://www.youtube.com/embed/hY7m5jjJ9mM",
        postTpe = Post.POST_TYPE.VIDEO,
        companyImg = "https://facebookbrand.com/wp-content/uploads/2019/04/f_logo_RGB-Hex-Blue_512.png?w=512&h=512"
    )
)