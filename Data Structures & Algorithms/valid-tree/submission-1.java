class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.offer(new int[]{0, -1});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0], parent = cur[1];

            if (visited.contains(node)) return false;

            visited.add(node);

            for (int nei : adj.get(node)) {
                if (nei == parent) continue;
                q.offer(new int[]{nei, node});
            }
        }

        return visited.size() == n;
    }
}
