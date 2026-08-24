package Arrays.LogicBuilding;

public class RemoveDuplicate {

        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == -1)
                    continue;

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        arr[j] = -1;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
