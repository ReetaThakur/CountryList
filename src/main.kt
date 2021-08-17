import java.util.*

fun main() {
    val obj=Scanner(System.`in`)
    val ree = ArrayList<String>()
    var country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    country=obj.next()
    ree.add(country)
    println("Enter Country Name")
    var count=0
    var name=obj.next()
    for (i in ree) {
        if (i == name){
            ++count
            break
        }
    }
    if (count==1) println("Country Found")
    else println("Country Not Found")

}
