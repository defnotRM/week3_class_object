abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

object GreyColor: FishColor {
    override val color = "grey"
}

class PrintFishAction(val food: String): FishAction {
    override fun eat(){
        println(food)
    }
}
class Shark: FishAction by PrintFishAction("hunt and eat fish"), FishColor by GreyColor{}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintFishAction("eat algae"), FishColor by fishColor{}