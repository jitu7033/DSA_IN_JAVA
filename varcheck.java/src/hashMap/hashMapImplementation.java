package hashMap;

import java.util.LinkedList;

public class hashMapImplementation {
    static class myHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private int N;// number of entries in map
        public myHashMap(){
            initBuckets(DEFAULT_CAPACITY);

        }

        public void rehash(){
            LinkedList<Node>[]oldBucket  = buckets;
            initBuckets(oldBucket.length*2);
            N = 0;
            for(var bucket:oldBucket){
                for(var node:bucket){
                    put(node.key,node.value);
                }
            }
        }
        public int capacity(){
            return buckets.length;
        }
        public float  factor(){
            return (float) ((N*1.0)/buckets.length);
        }
        private class Node{// node constructor
            K key;
            V value;

            Node(K key,V value){
                 this.key = key;
                this.value = value;
            }
        }
        private LinkedList<Node>[]buckets;
        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

        }
        private int hasFunction(K key){
            int hc = key.hashCode();// give me a hash value this is negative and positive
            return Math.abs(hc)%buckets.length;
        }
        // traverse the LinkedList and look for a node with key if found it return it index otherwise return null;
        private int searchInBucket(LinkedList<Node>ll,K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        public int size(){// size count no of n ;
            return N;
        }
        public void put(K key,V value) {// insert / update
            int bi = hasFunction(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei == -1) {// key does not exist we have to insert a new node;
                Node node = new Node(key, value);
                currentBucket.add(node);
                N++;
            } else {
                Node currentNode = currentBucket.get(ei);
                currentNode.value = value;
            }
            // rehash function;
            if (N >= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }
        public V get(K key){// get the value
            int bi = hasFunction(key);
            LinkedList<Node>currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket,key);
            if(ei!=-1){// if key is exist then return value;
                Node node  = currentBucket.get(ei);
                return node.value;
            }
            return null;

        }
        public V remove(K key){// remove the value
            int bi = hasFunction(key);
            LinkedList<Node>currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket,key);
            if(ei!=-1){// if key is exists;
                Node node = currentBucket.get(ei);
                V val = node.value;
                currentBucket.remove(ei);
                N--;
                return val;
            }
            return null;

        }
    }
    public static void main(String[] args) {
        myHashMap<String, String> map = new myHashMap<>();
        myHashMap<Integer, Integer> map1 = new myHashMap<>();
        map1.put(10, 10);
        map1.put(12, 10);
        System.out.println(map1.get(10));
    }
}
