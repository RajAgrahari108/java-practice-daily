// public class duplicateElement {

//     public static void main(String[] args) {
//         int a [] ={10, 20, 30, 10, 20, 40, 50};
//         boolean b[]= new boolean[a.length];
//         for(int i=0; i<a.length; i++){
//                 if(b[i] == false){
//                    int count = 1;
//                 }
//             for(int j=i+1; j<a.length; j++){
//                 if(a[i]==a[j]){
//                     count ++;
//                     b[j]=true;
//                 }
//             }
//             if(count>1){
//                 System.out.println(a[i]);
//             }
//         }
//     }
// }

public class duplicateElement {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 10, 20, 40, 50};
        boolean b[] = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (b[i] == false) {
                int count = 1; 
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        b[j] = true;
                    }
                }

                if (count > 1) {
                    System.out.println(nums[i]);
                }

                b[i] = true; 
            }
        }
    }
}
