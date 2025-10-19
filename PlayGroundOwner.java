package ass4;
/**
 * playground owner class to generate a generic type playground owner 
 * @author youssefsalah ,gasser ahmed , marwn mostafa 
 */
import static java.lang.System.exit;
import java.util.ArrayList;

public class PlayGroundOwner extends Register {

    private Playground PlayGround;
    /**
     * player parameterize constructor 
     * @param Name represent the name
     * @param Email represent the Email 
     * @param id represent the Id
     * @param Phone represent the Phone 
     */
    public PlayGroundOwner(String Name, String Email, int id, String Phone) {
        super(Name, Email, id, Phone);
         PlayGround=new Playground();
    }
    /**
     *play ground getter method 
     * @return the playground
     */

   public Playground getPlayGround() {
      return  PlayGround;
    }
    /**
    * playground add method 
    * @param Play_ground represent the playground 
    */
    
    public void Add(Playground Play_ground) {
        PlayGround=Play_ground;
    }
    /**
     * overridden name setter method 
     * @param name represent the name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    /**
     * overridden Phone setter method 
     * @param Phone represent the playground owner phone number
     */

    @Override
    public void setPhone(String Phone) {
        phone = Phone;
    }
    /**
     * overridden Email setter method 
     * @param Email represent the playground owner Email
     */

    @Override
    public void setEmail(String Email) {
        email = Email;
    }
    /**
     * overridden id setter method 
     * @param id represent the playground owner id
     */

    @Override
    public void setId(int id) {
        ID = id;
    }
    /**
     * overridden name getter method 
     * @return the playground owner name 
     */

    @Override
    public String getName() {
        return name;
    }
    /**
     * overridden Phone getter method 
     * @return the playground owner phone number 
     */

    @Override
    public String getPhone() {
        return phone;
    }
    /**
     * overridden id getter method 
     * @return the playground owner id 
     */

    @Override
    public int getId() {
        return ID;
    }
    /**
     * overridden Email getter method 
     * @return the playground owner email
     */

    @Override
    public String getEmail() {
        return email;
    }

    private int balance;
    /**
     * balance setter method
     * @param balance represent the playground owner balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * balance getter method 
     * @return the play ground owner balance
     */
    public int getBalance() {
        return balance;
    }   
}
