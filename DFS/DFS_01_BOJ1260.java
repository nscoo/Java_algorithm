package DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_01_BOJ1260 {
    public static int[][] graph;
    public static boolean[] visited;
    public static Queue<Integer> queue;
    public static int N; //정점
    public static int M; // 간선
    public static int V; // 정점번호
    public static void DFS(int start){
        visited[start] = true;
        System.out.print(start + " ");
        for(int i=1; i<=N; i++){
            if(graph[start][i] == 1 && visited[i]==false){
                DFS(i);
            }
        }
    }
    public static void BFS(int start){
        queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            for (int i =1; i<graph.length; i++){
                if(graph[tmp][i]==1 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        graph = new int [1001][1001];
        visited = new boolean[1001];

        for(int i =0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }
        DFS(V);
        System.out.println();

        Arrays.fill(visited,false);
        BFS(V);
    }
}
