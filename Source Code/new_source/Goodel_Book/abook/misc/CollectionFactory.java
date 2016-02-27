package abook.misc;
import java.util.*;

public class CollectionFactory {
	  public static final int ARRAY_LIST = 1;
	  public static final int LINKED_LIST = 2;

	  public static final int HASH_SET = 21;
	  public static final int LINKED_HASH_SET = 22;
	  public static final int TREE_SET = 23;

	  public static final int VECTOR = 61;

	  public static final int BEAN_CONTEXT_SERVICES_SUPPORT = 81;
	  public static final int BEAN_CONTEXT_CONTEXT_SUPPORT = 82;

	  public static final int HASH_MAP = 102;
	  public static final int HASHTABLE = 103;
	  public static final int IDENTITY_HASH_MAP = 104;
	  // public static final int RENDERING_HINTS = 105;
	  public static final int TREE_MAP = 106;
	  public static final int WEAK_HASH_MAP = 107;


	  private CollectionFactory() {
	  }

	  public static final Collection createCollection(int colType) throws Exception {
	    switch (colType) {
	      case ARRAY_LIST:
	        return (new ArrayList());
	      case LINKED_LIST:
	        return (new LinkedList());

	      case HASH_SET:
	        return (new HashSet());
	      case LINKED_HASH_SET:
	        return (new LinkedHashSet());
	      case TREE_SET:
	        return (new TreeSet());

	      case VECTOR:
	        return (new Vector());
	      default:
	        throw (new Exception());
	    }
	  }

	  public static final java.util.List createList(int listType) throws Exception {
	    switch (listType) {
	      case ARRAY_LIST:
	        return (new ArrayList());
	      case LINKED_LIST:
	        return (new LinkedList());
	      case VECTOR:
	        return (new Vector());
	      default:
	        throw (new Exception());
	    }
	  }

	  public static final Set createSet(int setType) throws Exception {
	    switch (setType) {
	      case HASH_SET:
	        return (new HashSet());
	      case LINKED_HASH_SET:
	        return (new LinkedHashSet());
	      case TREE_SET:
	        return (new TreeSet());
	      default:
	        throw (new Exception());
	    }
	  }

	  public static final SortedSet createSortedSet(int sortedSetType) throws Exception {
	    switch (sortedSetType) {
	      case TREE_SET:
	        return (new TreeSet());
	      default:
	        throw (new Exception());
	    }
	  }

	  public static final Map createMap(int mapType) throws Exception {
	    switch (mapType) {
	      case HASH_MAP:
	        return (new HashMap());
	      case HASHTABLE:
	        return (new Hashtable());
	      case IDENTITY_HASH_MAP:
	        return (new IdentityHashMap());
	      case TREE_MAP:
	        return (new TreeMap());
	      case WEAK_HASH_MAP:
	        return (new WeakHashMap());
	      default:
	        throw (new Exception());
	    }
	  }

	  public static final SortedMap createSortedMap(int sortedMapType) throws Exception {
	     switch (sortedMapType) {
	       case TREE_MAP:
	         return (new TreeMap());
	       default:
	         throw (new Exception());
	     }
	   }
	}
