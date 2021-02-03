import java.util.Arrays;

public class Sort {
    /*
    选择排序逻辑为：假设有十个数，第一个数先和第二个数比较，看是否交换，此时第一位的数字可能多次交换，直到（在本程序中）将最大的数字换到第一位
    然后将第二位和第三位进行比较，直到将第二大的数字放在第二位。
     */
    public static void main(String[] args) {
        int a[] = new int[]{1,3,5,3,2,1,5,7,8,99,3,4,5,};
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

}
