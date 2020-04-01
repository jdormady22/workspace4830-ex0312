package q1.extract_method.refactored;

import java.util.List;

public class A{
   Node m1(List<Node> nodes, String p) {
	   ex(nodes, p);
      // other implementation
      return null;
   }

   <T> Edge m2(List<T> edgeList, String p) {
      ex(edgeList, p);
      // other implementation
      return null;
   }

   <T> T ex(List<T> objs, String p) {
		for (T objs1 : objs) {
				if (objs.contains(p))
					System.out.println(objs);
		}
	// Other implementation not pertinent to this refactoring
	return null;
	}

}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}