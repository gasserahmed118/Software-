package ass4;
/**
 * play ground class to generate a generic type playground 
 * @author youssef salah ,gasser ahmed , marwn mostafa 
 */

import java.util.ArrayList;

public class Playground {

    private String name;
    private String location;
    private String size;
    private int price;
    private String cancellationPeriod;
    ArrayList<String> avaliablehours = new ArrayList<String>();
    /**
     * default constructor to add the slots 
     */

    Playground() 
    {
        //defalue avaliablehours
        avaliablehours.add("1-2");
        avaliablehours.add("2-3");
        avaliablehours.add("3-4");
    
    }
    /**
     * available hours setter method 
     * @param hours represent the hours
     */
   
    public void setAvailableHours(String hours) {
        for (int i = 0; i < avaliablehours.size(); i++) {
            if (avaliablehours.get(i).equals(hours)) {
                System.out.println("Sorry this hour already exist");
                return;
            }
        }
        System.out.println("The hour has been added");
        avaliablehours.add(hours);

    }
    /**
     * to remove a selected hour from the list 
     * @param removeSlot represent the remove slot 
     */

   public void changeAvaliableHours(String removeSlot )//when player book slot hence update avaliable slots
   {
       for (int i = 0; i < avaliablehours.size(); i++) {
            if (avaliablehours.get(i).equals(removeSlot)) 
                avaliablehours.remove(i);
       }
   }
   /**
    * available hours getter method 
    * @return the available hours
    */

    public ArrayList<String> getAvaliableHours()
    {
            return avaliablehours;
    }
    /**
     * name setter method 
     * @param name represent the name 
     */
   
    public void setName(String name) {
        this.name = name;
    }
    /**
     * name getter method 
     * @return the playground name 
     */

    public String getName() {
        return name;
    }
    /**
     * size setter method 
     * @param size represent the play ground size 
     */

    public void setSize(String size) {
        this.size = size;
    }
    /**
     * size getter method 
     * @return the playground size 
     */

    public String getSize() {
        return size;
    }
    /**
     * price setter method 
     * @param price represent the  playground price 
     */

    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * price getter method 
     * @return the playground price
     */

    public int getPrice() {
        return price;
    }
    /**
     * location setter method
     * @param location represent the playground location 
     */

    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * location getter method 
     * @return the playground location
     */

    public String getLocation() {
        return location;
    }
    /**
     * cancellation period setter method 
     * @param cancellationPeriod represent the cancellation period  
     */

    public void setCancellationPeriod(String cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }
    /**
     * cancellation period getter method 
     * @return the playground cancellation period
     */

    public String getCancellationPeriod() {
        return cancellationPeriod;
    }

}
