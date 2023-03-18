public class LinkedList {

    Node head = null;
    Node walk = null;
    int size = 0;

    public LinkedList() {
    }

    public void addWord(String word){
        if(size == 0){
            head = new Node(word);
            size++;
            return;
        }

        Node track=head;
        walk = null;
        while (track != null){
            if(track.data.equals(word)){
                track.freq++;
                return;
            }
            walk = track;
            track = track.next;
        }

        if(track == null)
            walk.next = new Node(word);
        size++;
    }

    public int getFreq(String word){
        walk = head;
        while(walk != null) {
                if (walk.data.contains(word)) {
                    walk.freq++;
                }
                walk = walk.next;
            }
        return walk.freq;
    }

    public String getWord(int idx){
        Node walker = head;

        for(int i = 0; i < idx; i++){
            if(walker!=null) {
                walker = walker.next;
            }
            else
                break;
        }
        if( walker != null)
            return walker.data;
        else
            return null;
    }
}
