//Name : AMAL JOHNSON
//ID : 21263175
public class Assignment2021Part2
{
    public static void main(String[] args) {

        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        final long SECONDS_IN_AN_HOUR = 60*60 ;
        String tweet = "";

        long millisSinceMidnight = 0, secondsSinceMidnight = 0 ;
        long hour = 0, minute = 0, second = 0 ;

        // Take the current time and remove all the time up to midnight last night 
        millisSinceMidnight = System.currentTimeMillis() % MILLISECONDS_IN_A_DAY;
        // Convert the millis to seconds
        secondsSinceMidnight = millisSinceMidnight / 1000;
        // Calculate how many hours are in secondsSinceMidnight
        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        // Calculate how many minutes are in time NOT INCLUDED in the hours
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
        // Calculate how many seconds are in time NOT INCLUDED in the hours and minutes
        second = secondsSinceMidnight % 60;

        int randomSelection = (int)(Math.random()*8);
        if(randomSelection == 0){
            tweet =  "Simplicity is a great virtue but it requires hard work to achieve it " +
            "and education to appreciate it.";
        } else if(randomSelection == 1){
            tweet = "The question of whether #MachinesCanThink is " +
            "is about as relevant as the question of whether #SubmarinesCanSwim.";
        } else if(randomSelection == 2) {
            tweet = "@CS4141Students @CS6371Students " +
            "The art of programming is the art of organizing complexity, " +
            "of mastering multitude and avoiding its bastard chaos as " +
            "effectively as possible." ;
        } else if(randomSelection == 3) {  
            tweet = "The competent programmer is fully aware of the strictly limited " +
            "size of his own #skull; therefore he approaches the programming " +
            "task in full #humility, and among other things he avoids clever " +
            "tricks like the plague. @SmartProgrammers" ;
        } else if(randomSelection == 4) {
            tweet = "In 1957 I married and Dutch marriage rites require you to state " +
            "your profession and I stated that I was a #programmer. But the " +
            "municipal authorities of the town of @Amsterdam did not accept it " +
            "on the grounds that there was no such profession." ;
        } else if(randomSelection == 5) {
            tweet = "How do we convince @people that in programming #simplicity and #clarity " +
            "â€” in short: what mathematicians call \"elegance\" â€” are not a dispensable " +
            "luxury, but a crucial matter that decides between success and failure?" ; 
        } else if(randomSelection == 6) {           
            tweet = "Automatic computers have now been with us for a quarter of a century. " +
            "They have had a great impact on our @society in their capacity of #tools, " +
            "but in that capacity their influence will be but a ripple on the surface " +
            "of our culture, compared with the much more profound influence they will " +
            "have in their capacity of #intellectual #challenge without precedent in the " +
            "cultural history of @mankind." ;            
        } else if(randomSelection == 7) {   
            tweet = "A picture may be worth a thousand words, but a formula is worth a thousand pictures.";
        }
        final int DISPLAY_WIDTH = 30;
        System.out.println("******************************");
        System.out.println("Tweet Analysis");
        System.out.println("==============");
        System.out.printf("Posted at %02d:%02d:%02d\n", hour, minute, second );
        System.out.println("Posted by @" +  System.getProperty("user.name"));
        System.out.println("Tweet text (unformatted) : " + tweet);
        System.out.println("");
        /* While I did not write the code to split the tweet display into segments for the original submission and thus got a 0 
         * for that part of the assignment, I did learn from the sample solution provided and was able to come with the 
         * following solution:
        */
        int segmentSize = tweet.length()/DISPLAY_WIDTH;
        System.out.printf("Tweet text as segments of %3d character segments: \n\n", DISPLAY_WIDTH);
        if(tweet.length()%DISPLAY_WIDTH != 0){
            segmentSize++;
        }
        for(int i=0; i<segmentSize; i++){
            int startPos = i*segmentSize;
            int endPos = startPos + DISPLAY_WIDTH;
            if(endPos > tweet.length()){
                endPos = tweet.length();
            }
            System.out.printf("%-" + DISPLAY_WIDTH + "s\n", tweet.substring(startPos, endPos));
        }
        System.out.println("");
        int i, count = 0 ;
        for( i = 0 ; i < tweet.length(); i = i + 1 ) {
            if("#".indexOf(tweet.charAt(i)) !=-1) {
                count = count + 1;
            }
        }
        System.out.printf("%02d\nHashtags",count);
        System.out.println("");
        for( i = 0 ; i < tweet.length(); i = i + 1 ) {
            if("@".indexOf(tweet.charAt(i)) !=-1) {
                count = count + 1;
            }
        }
        System.out.printf("%02d\nUsernames",count);
        System.out.println("");
        System.out.println("******************************");
    }
}