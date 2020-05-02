package Graph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Graph {
	
	class Vertex{
		String name;
		HashMap<Vertex, Integer> nbrs;
		
		Vertex(String name){
			this.name = name;
			this.nbrs = new HashMap<>();
		}
		
		public void display() {
			String str = this.name+ "->";
			Set<Vertex> nbrs= this.nbrs.keySet();
			for(Vertex nbr:nbrs)
			{
				str = str + nbr.name+ "(" + this.nbrs.get(nbr)+")";
			}
			str+= "End";
			System.out.println(str);
			
		}
	}
	
	HashMap<String, Vertex> vtcs;
	Graph(){
		this.vtcs = new HashMap<>();
	}
	
	public int numVtcs() {
		return this.vtcs.size();
	}
	
	public void addVertex(String name) {
		if(this.vtcs.containsKey(name))
		{
			return;
		}
		Vertex vtx = new Vertex(name);
		this.vtcs.put(name, vtx);
	}
	
	public void removeVertex(String name) {
		if(!this.vtcs.containsKey(name))
		{
			return;
		}
		
		Vertex vtx = this.vtcs.get(name);
		Set<Vertex> nbrs = vtx.nbrs.keySet();
		for(Vertex nbr: nbrs) {
			nbr.nbrs.remove(vtx);		
		}
		this.vtcs.remove(name);
	}
	
	public int numEdges() {
		Collection<Vertex> vtces = this.vtcs.values();
		int sum = 0;
		for(Vertex vtx:vtces) {
			sum+=vtx.nbrs.size();
		}
		return sum/2;
	}
	
	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtcs.get(name1);
		Vertex vtx2 = this.vtcs.get(name2);
		if(vtx1 == null|| vtx2 ==null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}
		
		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);
	}
	
	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtcs.get(name1);
		Vertex vtx2 = this.vtcs.get(name2);
		if(vtx1 == null|| vtx2 ==null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}
		
		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);
	}
	
	public void display() {
		Collection<Vertex> vtcs = this.vtcs.values();
		for(Vertex vtx:vtcs) {
			vtx.display();
		}
	}
}
