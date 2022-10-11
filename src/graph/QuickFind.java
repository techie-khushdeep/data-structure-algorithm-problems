package graph;
//quick find, time complexity will be O(1) and union will be O(n)
//space complexity will be O(n)
public class QuickFind {

    private int[] root;
    public QuickFind(int size){
        root = new int[size];
        //initialize
        for(int i=0;i<size;i++){
            root[i] = i;
        }
    }
    public int find(int x){
        return root[x];
    }

    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX!=rootY){
            for (int i=0;i<root.length;i++){
                if(root[i]==rootY){
                    root[i]=rootX;
                }
            }
        }

    }
    public boolean isConnected(int x, int y){
        return find(x)==find(y);
    }

    public static void main(String[] args) {
        // // 1-2-5-6-7 3-8-9 4
        QuickFind qf = new QuickFind(10);
        qf.union(1,2);
        qf.union(2,5);
        qf.union(5,6);
        qf.union(6,7);
        qf.union(3,8);
        qf.union(8,9);

        System.out.println(qf.isConnected(1,5));//true
        System.out.println(qf.isConnected(5,7));//true
        System.out.println(qf.isConnected(4,9));//false

        // 1-2-5-6-7 3-8-9-4
        qf.union(9,4);
        System.out.println(qf.isConnected(4,9));//true
    }
}
