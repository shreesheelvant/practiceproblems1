public class UC3 {
    public static void main(string[] args){
        int full_time=1;
        int part_time=2;
        int empwage_Hour=20;
        int empwage=0;
        int randomNumber=(int)(Math.random()*3);
        if (randomNumber == full_time) {
            empWorking_Hours = 8;
        } else if (randomNumber == part_time) {
            empWorking_Hours = 4;
        }else {
            empWorking_Hours = 0;
        }
        emp_wage= empWorking_Hours*empwage_Hour;
        System.out.println(emp_wage);
        }
    }
}
