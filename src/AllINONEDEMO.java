import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/10/5
 */
public class AllINONEDEMO {
    public static void main(String[] args) {
        AllOne one = new AllOne();
        one.inc("hello");
        one.inc("goodbye");
        one.inc("hello");
        one.inc("hello");
        System.out.println(one.getMaxKey());
        one.inc("leet");
        one.inc("code");
        one.inc("leet");
        one.dec("hello");
        one.inc("leet");
        System.out.println(one.getMaxKey());


    }
    static class AllOne {
        private class Bucket{
            int count;
            Set<String> keySet;
            Bucket next;
            Bucket prev;
            public Bucket(int count) {
                this.count = count;
                keySet = new HashSet<>();
            }
        }

        /*
        initial part
        */
        private Bucket head, tail;
        private Map<Integer, Bucket> countBucketMap;
        private Map<String, Integer> keyCountMap;

        public AllOne() {
            head = new Bucket(Integer.MIN_VALUE);
            tail = new Bucket(Integer.MAX_VALUE);
            head.next = tail;
            tail.prev = head;
            countBucketMap = new HashMap<>();
            keyCountMap = new HashMap<>();

        }

        public void inc(String key) {
            if(keyCountMap.containsKey(key)) {
                changeKey(key, 1);
            } else {
                keyCountMap.put(key, 1);
                if(head.next.count != 1) {//check if there is a bucket
                    addBucketAfter(new Bucket(1), head);
                }
                head.next.keySet.add(key);
                countBucketMap.put(1, head.next);
            }
        }

        public void dec(String key) {
            if(keyCountMap.containsKey(key)) {
                int count = keyCountMap.get(key);
                if(count == 1) {
                    keyCountMap.remove(key);
                    removeKeyFromBucket(countBucketMap.get(count), key);
                } else {
                    changeKey(key, -1);
                }
            }
        }

        public String getMaxKey() {
            return tail.prev == head ? "" : (String) tail.prev.keySet.iterator().next();
        }

        public String getMinKey() {
            return head.next == tail ? "" : (String) head.next.keySet.iterator().next();
        }
        /*
        Helper method
        */
        private void changeKey(String key, int offset) {
            int count = keyCountMap.get(key);
            keyCountMap.put(key, count + offset);

            Bucket curBucket = countBucketMap.get(count);
            Bucket newBucket;
            if(countBucketMap.containsKey(count + offset)) {
                newBucket = countBucketMap.get(count + offset);
            } else {
                newBucket = new Bucket(count + offset);
                countBucketMap.put(count + offset, newBucket);
                addBucketAfter(newBucket, offset == 1 ? curBucket : curBucket.prev);
            }
            newBucket.keySet.add(key);
            removeKeyFromBucket(curBucket, key);
        }

        private void removeKeyFromBucket(Bucket bucket, String key) {
            bucket.keySet.remove(key);
            if(bucket.keySet.size() == 0) {
                removeBucketFromList(bucket);
                countBucketMap.remove(bucket.count);
            }
        }

        private void removeBucketFromList(Bucket bucket) {
            bucket.next.prev = bucket.prev;
            bucket.prev.next = bucket.next;
            bucket.next = null;
            bucket.prev = null;
        }

        // add newBucket after preBucket
        private void addBucketAfter(Bucket newBucket, Bucket preBucket) {
            newBucket.prev = preBucket;
            newBucket.next = preBucket.next;
            preBucket.next.prev = newBucket;
            preBucket.next = newBucket;
        }
    }

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
}
