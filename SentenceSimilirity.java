class SentenceSimilirity{
    public static void main(String[] args) {
        String secret = "cat";

        String[] sentences = {
                "I love my pet",
                "A car ran fast",
                "He bought a hat",
                "The cat sat on the mat"
        };

        int[] score = new int[sentences.length];

        for (int i=0;i<sentences.length;i++)
        {
            String[] words = sentences[i].split(" ");
            
            int total =0;

            for(int j=0;j<words.length;j++)
            {
                String word = words[j].toLowerCase();
                if(word.length()==secret.length())
                {
                    for(int k=0;k<secret.length();k++)
                    {
                        if(word.charAt(k)==secret.charAt(k))
                        {
                            total++;
                        }
                    }
                }
            }
             score[i]=total;
          }
                // Sort scores and sentences
        for (int i = 0; i < score.length - 1; i++) {

            for (int j = 0; j < score.length - i - 1; j++) {

                if (score[j] < score[j + 1]) {

                    // swap scores
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;

                    // swap sentences
                    String tempSentence = sentences[j];
                    sentences[j] = sentences[j + 1];
                    sentences[j + 1] = tempSentence;
                }
            }
        }

            // Print final decoded string
            System.out.println("Final Decoded String:");

            for (int i = 0; i < sentences.length; i++) {

                System.out.print(sentences[i] + " ");
            }

    }
}