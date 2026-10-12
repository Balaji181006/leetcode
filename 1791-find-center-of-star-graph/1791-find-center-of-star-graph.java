class Solution {
    public int findCenter(int[][] arr) {
        Set<Integer> set=new HashSet<>();
        set.add(arr[0][0]);
        set.add(arr[0][1]);
        if(set.contains(arr[1][0])) return arr[1][0];
        else return arr[1][1];

    }
}