package test;

public class Test {

    public static void main(String[] args) {
        int num1 = 0,num2 =0,sum1=0,sum2=0;
//        num = num + 1;
//        num += 1;
//        num++;

        sum1 = (num1++) + 0;//sum = 0 เพราะว่า num++ ทำทีหลังตอนคำนวนเสร็จ
        System.out.println("num1 : "+num1+" sum1 : "+sum1);

        sum2 = (++num2) + 0;//sum = 0 เพราะว่า ++num บวกไปก่อนแล้วค่อยคำนวน
        System.out.println("num2 : "+num2+" sum2 : "+sum2);

        //ไอพวก ++ ทั้งหลาย ไม่นิยมเอามาบวกเลข loop นับคอลัม
    }
    
}
