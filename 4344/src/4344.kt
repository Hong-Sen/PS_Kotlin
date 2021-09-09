import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = StringTokenizer(br.readLine())
    val t = line.nextToken().toInt()

    for(i in 1..t){
        val line2 = StringTokenizer(br.readLine())
        val n = line2.nextToken().toInt()
        var sum = 0.0
        var arr = IntArray(1001)
        for(j in 1..n){
            val tmp = line2.nextToken().toInt()
            arr[j] = tmp
            sum += tmp
        }
        val average : Double = sum/n
        var upper = 0.0
        for(j in 1..n){
            if(arr[j] > average) upper++
        }
        val answer = upper/n * 100
        println("${String.format("%.3f",answer)}%")
    }
}