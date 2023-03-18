import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        LinkedList list = new LinkedList();

        File f = new File("input.txt");
        Scanner scanFile = new Scanner(f);
        while (scanFile.hasNext()) {
            String str = scanFile.next();
            String word = "";
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if ((ch <= 90 && ch >= 65) || (ch <= 122 && ch >= 97)){
                    word = word + ch;
                }
                else{
                    word = word + " ";
                }
            }
            word = word.trim();
            word = word.toLowerCase();
            list.addWord(word);
        }

        File file = new File("out.txt");
        java.io.FileWriter fileWriter = new java.io.FileWriter(file);
        BufferedWriter buffW = new BufferedWriter(fileWriter);
        FileReader fileReader = new FileReader();

        Node walk = list.head;

        while(walk!= null){
            buffW.write(walk.data + " " + walk.freq + "\n");
            walk = walk.next;
        }
        buffW.close();
    }
}