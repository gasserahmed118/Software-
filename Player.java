package ass4;
/**
 * player  class to generate a generic type player  
 * @author youssefsalah ,gasser ahmed , marwn mostafa 
 * 
 */
public class Player extends Register  {
    private Booking book;
    /**
     * player parameterize constructor 
     * @param Name represent the name
     * @param Email represent the Email 
     * @param id represent the Id
     * @param Phone represent the Phone 
     */
    public Player(String Name, String Email, int id, String Phone) {
        super(Name, Email, id, Phone);
            book = new Booking();
    }
    /**
     * book getter method 
     * @return the booking
     */
     public Booking getBook() {
      return  book;
    }
     /**
     * overridden name setter method 
     * @param name represent the player name
     */
     
    @Override
    public void setName(String name) {
        this.name = name;
    }
    /**
     * overridden Phone setter method 
     * @param Phone represent the player phone number 
     */
    @Override
    public void setPhone(String Phone) {
        phone = Phone;
    }
    /**
     * overridden Email setter  method
     * @param Email represent the player email 
     */
    @Override
    public void setEmail(String Email) {
        email = Email;
    }
    /**
     * overridden id setter  method
     * @param id represent the name
     */
    @Override
    public void setId(int id) {
        ID = id;
    }
    /**
     * overridden name getter method
     * @return the player name 
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * overridden phone getter method
     * @return the player phone number
     */
    @Override
    public String getPhone() {
        return phone;
    }
    /**
     * overridden id getter method 
     * @return the player id 
     */
    @Override
    public int getId() {
        return ID;
    }
    /**
     * overridden email getter method 
     * @return the player email 
     */
    @Override
    public String getEmail() {
        return email;
    }

    
}
