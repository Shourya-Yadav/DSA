class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int num:nums){
            if(num>=0){
                pos.add(num*num);
            }else{
                neg.add(num*num);
            }
        }
        Collections.reverse(neg);
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<pos.size()&& j<neg.size()){
            if(pos.get(i)<neg.get(j)){
                ans.add(pos.get(i));
                i++;
            }else{
                ans.add(neg.get(j));
                j++;
            }
        }
        while(i<pos.size()){
            ans.add(pos.get(i));
            i++;
        }
        while(j<neg.size()){
            ans.add(neg.get(j));
            j++;
        }
        int[] result=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            result[k]=ans.get(k);
        }
        return result;
    }
}