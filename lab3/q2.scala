object q02{
    def main(args: Array[String]) = {
        var a: Int = 4
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Float = 4.3f
        var g: Float = 4.0f



        println(s"variable values: a = $a, b = $b, c = $c, d = $d, k= $k\n")

        b-=1;
        d-=1;
        println("Question (a):")
        println(s"--b * a + c * d-- = ${b * a + c * d}\n")

        println("Question (b):")
        a+=1
        println(s"a++ = $a\n")

        println("Question (c):")
        println(s"-2 * ( g - k ) + c = ${-2*(g-k)+c}\n")

        println("Question (d):")
        c+=1
        println(s"c = c++ = $c\n")

        println("Question (e):")
        println(s"c = c++ * a++ = ${c * a}")
    }
}