package pertemuan12;

public class GraphMain {
	 public static void main(String[] args) {

	    Graph graph = new Graph(4);
	    //menambahkan vertex
	    graph.addVertex('A');
	    graph.addVertex('B');
	    graph.addVertex('C');
	    graph.addVertex('D');


	    //menambahedge
        graph.addEdge(0, 1); // A - B
        graph.addEdge(0, 2); // A - C
        graph.addEdge(0, 3); // A - D
        graph.addEdge(1, 3); // B - D
	    graph.adjancencyMatrix();
	    System.out.println();

	 }
}
