package com.sum.algorithms


fun main() {
    println(timeConversion("07:05:45PM"))

}


fun timeConversion(s: String): String {
    var hour =""
    val amPm = s.get(8).toString()
    when(amPm){
         "A" -> { if(s.substring(0,2) == "12") hour ="00"
                 else hour = s.substring(0,2) }
         "P" -> {if(s.substring(0,2) == "12")  hour = s.substring(0,2)
               else hour = (s.substring(0,2).toInt()+12).toString() }
    }
    return hour +s.substring(2,8)


}