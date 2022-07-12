public class oneDArray{
//aversge also calculated here.........
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];//self entering arrays
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;

        int autoarray[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31 }; //autoarray
        System.out.println("July has "+autoarray[8]+" days");
        System.out.println("July has "+month_days[8]+" days");
        double sum= 0;
        int i;
        for(i=0;i<12;i++){
            sum+=month_days[i];
        }
        System.out.println("AVERAGE of All month: "+sum/12);

    }
}