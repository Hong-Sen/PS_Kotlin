import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = StringTokenizer(br.readLine())
    val sb = StringBuilder()

    val n = line.nextToken().toInt()
    val x = line.nextToken().toInt()

    val line2 = StringTokenizer(br.readLine())

    for(i in 1..n){
        val tmp = line2.nextToken().toInt()
        if(tmp < x) sb.append("$tmp ")
    }
    println(sb)
}