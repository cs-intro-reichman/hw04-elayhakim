public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences. 
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int j= 0;j<sentences.length;j++){
//            String[] arr = strToArr(sentences[j]);
            String[] arr = sentences[j].split(" ");
            for(int i= 0;i<arr.length;i++){
                for(int z= 0;z<keywords.length;z++){
                    if(keywords[z].equalsIgnoreCase(arr[i])){
                        System.out.println(sentences[j]);
                        break;
                    }
                }
            }
        }
    }

    // public static int SpacesP1(String sentence) {
    //     int count =1;
    //     for(int i=0; i<sentence.length();i++){
    //         if(sentence.charAt(i)== ' '){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static String[] strToArr(String str){
    //     String[] arr = new String[SpacesP1(str)];
    //     int i=0;
    //     for(int j =0; j<arr.length;j++){
    //         arr[j]="";
    //         while (i < str.length() && str.charAt(i) != ' ') {
    //             arr[j]+= str.charAt(i);
    //             i++;
    //         }
    //         while (str.charAt(i) == ' '){
    //             i++;
    //         }
    //     }
    //    return arr;
    // }
}
