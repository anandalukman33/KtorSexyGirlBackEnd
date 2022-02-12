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
    Sexy("Medusa", "Medusa from Fate/Grand Order. 1st reward of the (late) January pack.", "$BASE_URL/girlimage/animegirl17.jpg"),
    Sexy("Myra", "Myra Year of the Tiger - OC", "$BASE_URL/girlimage/animegirl18.jpg"),
    Sexy("Chloe - OC", "Modern Sexy Outfit Chloe", "$BASE_URL/girlimage/animegirl19.jpg"),
    Sexy("Shenhe", "Shenhe from Genshin Impact.", "$BASE_URL/girlimage/animegirl20.jpg"),
    Sexy("Kiko", "Kiko Happy New Year - OC", "$BASE_URL/girlimage/animegirl21.jpg"),
    Sexy("Windranger Arcana Christmas", "A Christmas Windranger Arcana (Dota2) for SleepyKorok, made for LillyPadArts's Secret Santa!", "$BASE_URL/girlimage/animegirl22.jpg"),
    Sexy("Windranger Arcana Christmas 2", "A Christmas Windranger Arcana (Dota2) for SleepyKorok, made for LillyPadArts's Secret Santa!", "$BASE_URL/girlimage/animegirl23.jpg"),
    Sexy("Jean", "Jean in swimsuit, from Genshin Impact. Part of my latest Gumroad pack.", "$BASE_URL/girlimage/animegirl24.jpg"),
    Sexy("Ryuko Matoi - Kill la Kill", "Ryuko Matoi in her full Life Fiber Synchronization form, from Kill la Kill. Part of my latest Gumroad pack.", "$BASE_URL/girlimage/animegirl25.jpg"),
    Sexy("Zero Two - DARLING in the FRANX", "Zero Two from DARLING in the FRANXX, in her summer suit. Third and last reward of the June Patreon pack. I had to censor with sunscreen.", "$BASE_URL/girlimage/animegirl26.jpg"),
    Sexy("Byleth Summer - Fire Emblem Heroes", "Byleth from Fire Emblem wearing a swimsuit, from my latest Gumroad pack.", "$BASE_URL/girlimage/animegirl27.jpg"),
    Sexy("Miku Nakano - The Quintessential Quintuplets", "Miku Nakano from The Quintessential Quintuplets. Third and last reward of the March Patreon pack. It took me a while, but now I'm doing much better.", "$BASE_URL/girlimage/animegirl28.jpg"),
    Sexy("Byleth - Fire Emblem Heroes", "Summer Byleth from Fire Emblem Heroes. First reward of the March Patreon pack.", "$BASE_URL/girlimage/animegirl29.jpg"),
    Sexy("Ahri - LoL", "Ahri in a chill version from League of Legends, third and last reward of the January pack (it took a while). I really hope the result was worth the wait!", "$BASE_URL/girlimage/animegirl30.jpg"),
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