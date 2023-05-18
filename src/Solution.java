import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer>myset=new HashSet<>();
        List<Integer>output=new ArrayList<>();
        for (int i=0;i<edges.size();i++)
        {
            if (!myset.contains(edges.get(i).get(1)))
            {
                myset.add(edges.get(i).get(1));
            }
        }
        for (int i=0;i<n;i++)
        {
            if (!myset.contains(i))
                output.add(i);
        }
        return output;
    }



}
