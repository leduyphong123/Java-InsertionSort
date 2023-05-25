
public class Main{
    static int[] array={6,3,4,7,-2,-4};
    public static void main(String[] args){
        insertionSort(array);
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.println("Swap :" +array[pos] + " to " + array[pos-1]);
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            System.out.println("for i= "+i+" " +array[pos] + " to " + x);
            array[pos] = x;
            System.out.println("------------------------");

        }
    }
}