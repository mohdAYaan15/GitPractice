package DataTypes;
public class ApplesDistribution{
    public static void main(String[] args){
        // total apples declared
        int apples = 15;

        //total friends to get apples 
        int friends = 4;

        // find no. of apple each friend get
        int eachfriend = apples/friends;
        
        // find remaining apple after distribution
        int remaining_apples = apples % friends;

        // print both values
        System.out.println(" each friend gets " + eachfriend + " apples." );
        System.out.println("Remaining apples : " + remaining_apples );


    }
}