
object q04{
    def main (args: Array[String]) = {

        val working_hour = 250
        val OT_hour = 85


        println(s"Pay rate for normal working hours = Rs.$working_hour")
        println(s"Pay rate for OT working hours = Rs.$OT_hour\n")
        println(s"Tax = 12%\n")
    }

    def wh_payment(w_hours: Int): Double = {
        w_hours*250;
    }

    def OT_payment(ot_hours: Int): Double = {
        ot_hours*85;
    }

    def gross_salary(w_h: Int, ot_h: Int): Double = {
        wh_payment(w_h) + OT_payment(ot_h)
    }

    def tax(salary: Double): Double = {
        salary*0.12;
    }

    def net_salary(w_h: Int, ot_h: Int): Double = {
        gross_salary(w_h, ot_h) - tax(gross_salary(w_h,ot_h))
    }

    println("Enter the number of regular working hours: ")
    val w_h = scala.io.StdIn.readLine().toInt

    print("Enter the number of OT hours: ")
    val ot_h = scala.io.StdIn.readLine().toInt

    val find_salary = net_salary(w_h,ot_h);

    println(s"Total Salary: $find_salary")

}