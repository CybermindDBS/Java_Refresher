import java.util.*;

public class CollectionAPI {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // ArrayList, LinkedList
        LinkedList linkedList = new LinkedList();
        Set set = new HashSet(); // HashSet, TreeSet
        Map map = new HashMap(); // HashMap, TreeMap

        Stack stack = new Stack();
        Queue queue = new LinkedList(); // via LinkedList, via PriorityQueue
        PriorityQueue priorityQueue = new PriorityQueue();
        Deque deque = new ArrayDeque();
        Deque deque2 = new LinkedList();

//        arrayList.add();
//        arrayList.addAll();
//        arrayList.toArray(new Integer[0]);
//        arrayList.clear();
//        arrayList.contains();
//        arrayList.containsAll();
//        arrayList.stream();
//        arrayList.isEmpty();
//        arrayList.removeAll();
//        arrayList.remove();
//        arrayList.retainAll();
//        arrayList.size();
//        arrayList.get();
//        arrayList.subList();

//        same methods as ArrayList plus the below:
//        The below methods are also present in Deque, but not in Queue and PriorityQueue,
//        linkedList.addFirst();
//        linkedList.addLast();
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.getFirst();
//        linkedList.getLast();
//        linkedList.pop();
//        linkedList.peek();
//        linkedList.poll();

//        set.add();
//        set.addAll();
//        set.remove();
//        set.removeAll();
//        set.retainAll();
//        set.toArray(new Integer[0]);
//        set.containsAll();
//        set.contains();
//        set.isEmpty();
//        set.size();
//        set.clear();
//        set.stream();

//        map.put();
//        map.size();
//        map.isEmpty();
//        map.get();
//        map.entrySet();
//        map.keySet();
//        map.putAll();
//        map.values();
//        map.containsKey();
//        map.containsValue();
//        map.getOrDefault();
//        map.putIfAbsent();
//        map.remove();

//        stack.push();
//        stack.pop();
//        stack.peek();
//        stack.search();
//        stack.size();

//        queue.add();
//        queue.poll();
//        queue.peek();
//        queue.size();
    }

    public static void ArrayListToPrimitiveArray() {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int arr[] = new int[al.size()];
        int ptr[] = {0};
        al.stream().forEach((x) -> arr[ptr[0]++] = x);
        System.out.println(Arrays.toString(arr));
    }

    public static void ArrayListToIntegerArray() {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer arr[] = al.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }

    public static void IterationInMaps() {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void Iterator_ListIterator() {
        // Iterators can remove elements from the list while iterating on that list unlike for and for-each loop
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = al.iterator();
//        Useful Methods:
//        iterator.hasNext();
//        iterator.next();
//        iterator.remove();
//        iterator.forEachRemaining();

        ListIterator<Integer> listIterator = al.listIterator();
//        Useful Methods:
//        listIterator.hasNext();
//        listIterator.next();
//        listIterator.hasPrevious();
//        listIterator.previous();
//        listIterator.nextIndex();
//        listIterator.previousIndex();
//        listIterator.remove();
//        listIterator.add();
//        listIterator.set();
//        listIterator.forEachRemaining();


//      The Below 2 operations won't work because it is only supported in Collections.

        int[] arr = {1, 2, 3};
        PrimitiveIterator.OfInt itr = Arrays.stream(arr).iterator();
//        itr.next();
//        itr.remove(); // Not supported for PrimitiveIterator.OfInt, Compile-Time error
//        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = {1, 2, 3, 4};
        Iterator<Integer> itr2 = Arrays.stream(arr2).iterator();
//        itr2.next();
//        itr2.remove(); // Still not Supported, Results in compile time error
//        System.out.println(Arrays.toString(arr2));
    }

    public static void PriorityQueue_MinHeap_MaxHeap() {
        // Min Heap
        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek()); // output: 1

        // Max Heap
        PriorityQueue<Integer> queue2 = new PriorityQueue(Comparator.reverseOrder());
        queue2.add(1);
        queue2.add(3);
        queue2.add(2);
        System.out.println(queue2.peek()); // output: 3
    }

    public static void test() {
        // al2 will be empty after executing this code;
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        al2.removeAll(al);
        System.out.println(al2);
    }

    public static void test2() {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ListIterator<Integer> iterator = al.listIterator();
        iterator.next();
        iterator.add(10);
        iterator.previous();
        iterator.remove();
        System.out.println(al);
    }
}