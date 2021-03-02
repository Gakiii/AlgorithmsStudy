import java.util.Arrays;

public class Sort {
    /*
    选择排序逻辑为：假设有十个数，第一个数先和第二个数比较，看是否交换，此时第一位的数字可能多次交换，直到（在本程序中）将最大的数字换到第一位
    然后将第二位和第三位进行比较，直到将第二大的数字放在第二位。
     */
    public static void main(String[] args) {
        selectSort();
        bubbleSort();
        bucketSort();
    }

    public static void selectSort(){
        int [] a= new int[]{1,3,5,3,2,1,5,7,8,99,3,4,5,};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(){
        int [] a = new int[]{1,3,5,3,2,1,5,7,8,99,3,4,5,};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length - i -1;j++){
                if(a[j]<a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


    /*
    桶排序，高效的以空间换时间的算法，但是对于空间的浪费过于严重
    辅助数组的长度等于一个数组中最大的数字+1
     */
    public static void bucketSort(){
        int[] a = new int[]{1,3,5,3,2,1,5,7,8,99,3,4,5,};
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i])
                max = a[i];
        }
        int [] b= new int[max+1];
        for(int i=0;i<a.length;i++){
            b[a[i]]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]!=0){
                for(int j=0;j<b[i];j++){
                    System.out.println(i);
                }
            }
        }


    }

}
