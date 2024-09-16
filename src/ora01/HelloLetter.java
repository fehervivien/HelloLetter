package ora01;

public class HelloLetter {
    public static void main(String[] args) {
        System.out.println("Alma");
        bubbleSort();
    }

    /*A buborék rendezés az adatok sorozatát (pl. egy tömb) úgy rendezi,
    hogy folyamatosan összehasonlítja az egymás mellett lévő elemeket.*/
    
    public static void bubbleSort() {
        int nums[] = {5,1,6,2,4,3};
        int size=nums.length;
        int temp = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - 1; j++) {

                if(nums[j] > nums[j + 1]) {
                  temp = nums[j];
                  nums[j] = nums[j + 1];
                  nums[j + 1] = temp; 
              }
            }
        }
    }
}