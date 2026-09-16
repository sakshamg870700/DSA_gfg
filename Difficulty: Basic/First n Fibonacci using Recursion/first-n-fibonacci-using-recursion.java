class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();

               if (n <= 0) {
                   return result;
               }

               result.add(0);
               if (n == 1) {
                   return result;
               }

               result.add(1);
               if (n == 2) {
                   return result;
               }

               generateFib(n, result);
               return result;
           }

           private void generateFib(int n, ArrayList<Integer> result) {
               if (result.size() == n) {
                   return;
               }

               int size = result.size();
               int nextFib = result.get(size - 1) + result.get(size - 2);

               result.add(nextFib);

               generateFib(n, result);
    }
}