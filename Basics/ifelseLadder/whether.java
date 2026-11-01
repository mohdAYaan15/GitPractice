package ifelseLadder;

public class whether {
    public static void main(String[] args){
        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("it is a sunnny day ");
        }
        else if(weather.equals("windy")){
            System.out.println(" its s windy day " );
        }
        else if(weather.equals("rainy")){
            System.out.println("its a rainy day ");
        }
        else if(weather.equals("cloudy")){
            System.out.println("its a cloudy day ");
        }   
        else{
            System.out.println("its a normal day " );
        } 
  
        
    }
}
