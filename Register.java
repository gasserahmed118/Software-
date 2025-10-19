package ass4;
/**
 * Register class to generate a generic type register 
 * @author youssef salah ,gasser ahmed , marwn mostafa 
 */

 public abstract class Register {

    protected String name;
    protected String email;
    protected int ID;
    protected String phone;
    /**
     * parameterize constructor
     * @param Name represent the name 
     * @param Email represent the Email 
     * @param id represent the id 
     * @param Phone represent the phone 
     */
    public Register(String Name, String Email, int id, String Phone) {
        name = Name;
        email = Email;
        ID = id;
        phone = Phone;
    }
    /**
     * name setter method 
     * @param name represent the name 
     */
    public abstract void setName(String name);
    /**
     * Phone setter method 
     * @param Phone represent the phone 
     */

    public abstract void setPhone(String Phone);
    /**
     *Email setter method
     * @param Email represent the email 
     */
    public abstract void setEmail(String Email);
    /**
     * id setter method 
     * @param id represent the id 
     */

    public abstract void setId(int id);
    /**
     * name getter method 
     * @return the name
     */
    public abstract String getName();
    /**
     * phone getter method 
     * @return 
     */
    public abstract String getPhone();
    /**
     * id getter method 
     * @return the id  
     */
    public abstract int getId();
    /**
     * email getter method 
     * @return the email 
     */

    public abstract String getEmail();
}
