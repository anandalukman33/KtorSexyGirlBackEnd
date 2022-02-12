package id.my.anandalukman.route

import id.my.anandalukman.bean.Sexy
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "https://obasaka.herokuapp.com"
private val sexyGirl = listOf(
    Sexy("Ahri", "Christmas Sexy Outfit", "$BASE_URL/girlimage/animegirl1.jpg"),
    Sexy("Akagi", "Big tits white fox girl charmy", "$BASE_URL/girlimage/animegirl2.jpg"),
    Sexy("Atago", "Black Bikini Outfit Otago", "$BASE_URL/girlimage/animegirl3.jpg"),
    Sexy("AtagoNew", "Outfit Pilot Girl", "$BASE_URL/girlimage/animegirl4.jpg"),
    Sexy("AyameHimuro", "Doctor Pose Outfit", "$BASE_URL/girlimage/animegirl5.jpg"),
    Sexy("Bismarck", "Queen of Azure Lane", "$BASE_URL/girlimage/animegirl6.jpg"),
    Sexy("Chloe", "Semi Nude Chloe", "$BASE_URL/girlimage/animegirl7.jpg"),
    Sexy("Ganyu", "Fairy Forest Ganyu", "$BASE_URL/girlimage/animegirl8.jpg"),
    Sexy("Genshin Outfit", "4 Girl Genshin Impact Outfit", "$BASE_URL/girlimage/animegirl9.jpg"),
    Sexy("Genshin Swim Outfit", "4 Girl Genshin Impact Swim Outfit", "$BASE_URL/girlimage/animegirl10.jpg"),
    Sexy("Louis", "Secretary outfit", "$BASE_URL/girlimage/animegirl11.jpg"),
    Sexy("MaiShiranui", "Chainesse Outfit", "$BASE_URL/girlimage/animegirl12.jpg"),
    Sexy("Nier", "Nier Sexy Outfit", "$BASE_URL/girlimage/animegirl13.jpg"),
    Sexy("Ningguang", "Lingerie Outfit", "$BASE_URL/girlimage/animegirl14.jpg"),
    Sexy("NingguangSee", "Chainesse Outfit", "$BASE_URL/girlimage/animegirl15.jpg"),
    Sexy("NingguangPose", "Ningguang Pose", "$BASE_URL/girlimage/animegirl16.jpg"),
)

/**
 * Method GET list of SexyGirl
 * and set for random get
 */

fun Route.randomGirl() {
    get("/sexygirl") {
        call.respond(
            HttpStatusCode.OK,
            sexyGirl.random()
        )
    }
}