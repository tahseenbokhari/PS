package algo1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Download the text file here. (Right click and save link as)
The file contains the adjacency list representation of a simple undirected graph. 
There are 200 vertices labeled 1 to 200. The first column in the file represents the vertex label, 
and the particular row (other entries except the first column) tells all the vertices that the vertex 
is adjacent to. So for example, the 6th row looks like : "6	155	56	52	120	......". This just means that the vertex 
with label 6 is adjacent to (i.e., shares an edge with) the vertices with labels 155,56,52,120,......,etc

Your task is to code up and run the randomized contraction algorithm for the min cut problem and use it on 
the above graph to compute the min cut. (HINT: Note that you'll have to figure out an implementation of edge contractions. 
Initially, you might want to do this naively, creating a new graph from the old every time there's an edge contraction. 
But you should also think about more efficient implementations.) (WARNING: As per the video lectures, please make sure to 
run the algorithm many times with different random seeds, and remember the smallest 
cut that you ever find.) Write your numeric answer in the space provided. So e.g., if your answer is 5, just type 5 in the space provided.
 */

public class MinCut {

	static int numV = 200;
	int curNumV;
	int [][] graph;

	public MinCut(){
		graph = new int[numV][numV];
		curNumV = numV;
		for(int i = 0; i < numV; i++)
			for(int j = 0; j < numV; j++)
				graph[i][j] = 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(".\\algo1\\kargerMinCut.txt"));
			String str;
			while ((str=br.readLine())!=null){
				String splits[] = str.split(" ");
				
				for(String s : splits){
					graph[Integer.parseInt(split[0])][Integer.parseInt(s)] = 1;
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
