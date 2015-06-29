package tk.deep;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dozray on 2015/6/29.
 */
public class CompositeComparator implements Comparator{

    /** in the condition list, comparators' priority decrease from head to tail */
    private List comparators = new LinkedList();

    /** get the comparators, you can manipulate it as need. */
    public List getComparators(){
        return comparators;
    }

    /** add a batch of comparators to the condition list */
    public void addComparators(Comparator[] newComparators)
    {
        if( newComparators == null){
            return ;
        }
        for(int i=0,j=newComparators.length;i<j;i++){
            comparators.add(newComparators[i]);
        }
    }

    /**
     * Compare by priority
     * @param o2
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {

        for (Iterator iterator = comparators.iterator(); iterator.hasNext();) {
            Comparator comparator = (Comparator) iterator.next();
            int result = comparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
