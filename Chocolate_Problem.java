class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int start=0;
        int end=m-1;
        int min_dif=Integer.MAX_VALUE;
        while(end<a.size()){
            int dif=a.get(end)-a.get(start);
            min_dif=Math.min(dif,min_dif);
            start++;
            end++;
        }
        return min_dif;
    }
}