package com.company;

public class Main {

    public static void main(String[] args) {
        {

            /* Coding a Serious Business Application */
      /*  int beerNum = 99;
        String word="bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }   */


            /*-----------------------------------------------------------------------------------------------------------*/

            //  Phrase-O-Matic:
            // make three sets of words to choose from. Add your own!
            String[] wordListOne = {"24/7", "multiTier", "30,000 foot", "B-to-B,win-win", "frontend", "web-based", "pervasive", "smart", "sixsigma", "critical-path", " dynamic"};
            String[] wordListTwo = {"empowered", "sticky",
                    "“value-added”", "“oriented”", "“centric”", "“distributed”",
                    "“clustered”", "“branded”", "”outside-the-box”", "“positioned”",
                    "“networked”", "“focused”", "“leveraged”", "“aligned”",
                    "“targeted”", "“shared”", "“cooperative”", "“accelerated”"};
            String[] wordListThree = {"“process”", "“tippingpoint”", "“solution”", "“architecture”", "“core competency”",
                    "“strategy”", "“mindshare”", "“portal”", "“space”", "“vision”",
                    "“paradigm”", "“mission”"};
            // find out how many words are in each list
            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;
            // generate three random numbers
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);
            // now build a phrase
            String phrase = wordListOne[rand1] + "“ “" + wordListTwo[rand2] + "“ “" + wordListThree[rand3];
            // print out the phrase
            System.out.println("“What we need is a “" + phrase);


            /*---------------------------------------------------------------------------------------------------------*/

            //  another example:
       /* String[] wordListOne = {
                "24/7",
                "multi-Tier",
                "30,000 foot",
                "B-to-B",
                "win-win",
                "front-end",
                "web-based",
                "pervasive",
                "smart",
                "six-sigma",
                "critical-path",
                "dynamic",
                "Internet-connected"
        };

        String[] wordListTwo = {
                "empowered",
                "powered",
                "sticky",
                "value-added",
                "oriented",
                "centric",
                "distributed",
                "clustered",
                "branded",
                "outside-the-box",
                "positioned",
                "networked",
                "focused",
                "leveraged",
                "aligned",
                "targeted",
                "shared",
                "cooperative",
                "accelerated"
        };

        String[] wordListThree = {
                "tipping point",
                "solution",
                "process",
                "architecture",
                "core competency",
                "strategy",
                "mindshare",
                "portal",
                "space",
                "vision",
                "paradigm",
                "mission"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()* oneLength);
        int rand2 = (int) (Math.random()* twoLength);
        int rand3 = (int) (Math.random()* threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);    */
        }
    }
}
