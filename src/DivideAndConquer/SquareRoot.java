package DivideAndConquer;

public class SquareRoot {

//this is the optimised approach, that we wil be using to Find,Square root Using, Binary Search ny dividiing it

    public static int findSquareRoot(int number){
        int start=0;
        int end=number;
        int mid=number/2;
        if(mid*mid ==number){
            return mid;
        }
        return 0;
    }
}




    /*
    public static int findSquareRoot(int number){
        if (number== 0) {
            return 0;
        }
        if (number==1){
            return 1;
        }
        int index=1;
        while(index<number/2){
            if(index * index == number){
                return index;

            }else{
                index++;
            }
        }
        return 0;
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int numberFindSquareRoot = sc.nextInt();
        int result=findSquareRoot(numberFindSquareRoot);
        System.out.println("The Square Root Of The"+numberFindSquareRoot+",is:"+(result));
    }
}

     */
