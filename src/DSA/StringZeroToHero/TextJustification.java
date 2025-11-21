package StringZeroToHero;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    static int  MAX_WIDTH;

    public static String findLine(int i,int j,int eachGaddhaSpace,int extraSpaceGaddha, String[] words){
        String line = "";
        for(int k = i; k < j; k++){
            line += words[k];

            if(k == j-1){
                continue;
            }

            for(int z = 1; z <= eachGaddhaSpace; z++){
                line += " ";
            }
            if(extraSpaceGaddha > 0){
                line += " ";
                extraSpaceGaddha--;
            }
        }
        while(line.length() < MAX_WIDTH){
            line += " ";
        }
        return line;
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        MAX_WIDTH = maxWidth;
        int i = 0;

        while(i < n){

            int letterCount = words[i].length();
            int j = i+1;
            int gaddhe = 0;

            while(j < n && words[j].length() + 1 + gaddhe + letterCount <= maxWidth){
                letterCount += words[j].length();
                gaddhe += 1;
                j++;
            }

            int remainingGaddhe = maxWidth - letterCount;

            int eachGaddhaSpace = gaddhe == 0 ? 0 : remainingGaddhe / gaddhe;
            int extraSpaceGaddha = gaddhe == 0 ? 0 : remainingGaddhe % gaddhe;

            if( j == n){
                eachGaddhaSpace = 1;
                extraSpaceGaddha = 0;
            }
            result.add(findLine(i, j, eachGaddhaSpace, extraSpaceGaddha, words));

            i = j;
        }
        return result;
    }
    public static void main(String[] args) {

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        System.out.println(fullJustify(words, maxWidth));

    }
}
