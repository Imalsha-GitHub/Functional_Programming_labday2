object q01{
    def main(args: Array[String]) = {

        var k, i, j = 2;
        var m, n = 5;
        var f = 12.0f
        var g = 4.0f;
        var c = 'X';

        println(s"variable values: k = $k, i = $i, j = $j, m = $m, n = $n, f = $f, g = $g, c = $c \n")

        println("Question (a):")
        println(s"k + 12*m = ${k + 12*m}\n")

        println("Question (b):")
        println(s"m/j = ${m/j}\n")

        println("Question (c):")
        println(s"n%j = ${n%j}\n")

        println("Question (d):")
        println(s"m/j*j = ${m/j*j}\n")

        println("Question (e):")
        println(s"f + 10*5 + g = ${f+10*5 +g}\n")

        i += 1
        println("Question (f):")
        println(s"++i * n = ${i*n}")

    }
}