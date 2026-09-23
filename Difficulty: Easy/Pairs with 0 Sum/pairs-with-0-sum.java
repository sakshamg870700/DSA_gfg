class Solution {
    public ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                ans.add(pair);

                int a = arr[i], b = arr[j];

                while (i < j && arr[i] == a)
                    i++;

                while (i < j && arr[j] == b)
                    j--;
            } 
            else if (sum < 0) {
                i++;
            } 
            else {
                j--;
            }
        }

        return ans;
    }
}