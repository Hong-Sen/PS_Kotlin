import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

fun binarySearch(mid:Int, c:Int, n:Int, arr:IntArray) : Int {
    var std = arr[0]
    var cnt = c
    for(i in 1..n-1){
        if(arr[i] - std >= mid){
            cnt++
            std = arr[i]
        }
    }
    return cnt
}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = StringTokenizer(br.readLine())
    val n = line.nextToken().toInt()
    val c = line.nextToken().toInt()

    var arr = IntArray(n)
    var result = 0

    for(i in 0..n-1){
        val line2 = StringTokenizer(br.readLine())
        val num = line2.nextToken().toInt()
        arr[i] = num
    }
    arr.sort()

    var start = 1
    var end = arr[n-1]
    while (start <= end){
        var mid = (start+end)/2
        var cnt = binarySearch(mid,1,n,arr)
        if(cnt >= c){
            result = max(result,mid)
            start = mid+1
        }
        else {
            end = mid - 1
        }
    }
    print(result)
}