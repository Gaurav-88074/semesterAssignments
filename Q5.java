public class Q5 {
    public static void add(int i ,float f){
        System.out.println(i+f);
    }
    public static int  add(double d ,int i){
        return (int)(d+i);
    }
    public static double  add(double d1 ,double d2){
        return (double)(d1+d2);
    }
    public static void main(String[] args) {
        add(3,4);
        add(3.5,4.5);
    }
}
/*
add(3,4)
this function will generate an error
beacuse the method(3,4) is ambiguous
.during compilation function will try to update
argument but not will able to select 
which function to call 
add(int,float) or add(double,int)

this function will excute because
it having both argument (double,double)
*/