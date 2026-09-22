class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
ArrayList<Integer>list = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i]==i+1){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
