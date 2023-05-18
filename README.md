# MinimumVertexCover-GraphTraversal
This repository contains an algorithm that solves the problem of finding the smallest set of vertices from which all nodes in the graph are reachable
## Algorithm Description
The algorithm takes an integer n representing the number of vertices in the graph and a list of lists edges representing the edges between vertices. The algorithm returns a list of integers representing the smallest set of vertices that cover all the edges in the graph.

## The algorithm works as follows:

- Create a HashSet called myset to store the vertices that are reached by any edge.
- Iterate through each edge in the edges list.
- For each edge, check if the second vertex  is not already present in the HashSet.
- If the second vertex is not present in HashSet, add it to the set.
- Iterate through all vertices .
- For each vertex, check if it is not present in the HashSet.
- If the vertex is not present in the HashSet, add it to the output list.
- Return the output list.
##  Time Complexity
The time complexity of this algorithm is O(V + E), where V is the number of vertices and E is the number of edges in the graph. The algorithm iterates through all the edges in the edges list once. Then it iterates through all the vertices from 0 to n-1 to build the output list. Both operations have linear time complexity.

## Space Complexity
The space complexity of this algorithm is O(V), where V is the number of vertices in the graph. The algorithm uses a HashSet myset to store the vertices reached by any edge. In the worst case, all vertices can be reached, resulting in all vertices being stored in the set.
