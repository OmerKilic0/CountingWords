public class FileReader {

    public String getFileString(LinkedList list){
        String s = "";
        for(int i = 0; i< list.size; i++){
            s = s.concat(list.getWord(i) + "\n");
        }
        return s;
    }
}