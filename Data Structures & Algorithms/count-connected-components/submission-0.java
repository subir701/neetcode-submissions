class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++)list.add(new ArrayList<>());

        for(int[] e: edges){
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }

        int res = 0;
        boolean[] visit = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visit[i]){
                dfs(i,visit, list);
                res++;
            }
        }

        return res;
    }

    private void dfs(int node, boolean[] visit, ArrayList<ArrayList<Integer>> list){
        visit[node] = true;

        for(int n:list.get(node)){
            if(!visit[n]){
                dfs(n,visit,list);
            }
        }
    }
}
