package ass4;

import java.util.Scanner;
public class ASS4 {

    public static void main(String[] args) {
       //first requierment :   registering a user (playground owner or player)
       System.out.println("Welcome player please enter your inforamtion in this order Name,ID,Email,Phone");
       Scanner in = new Scanner(System.in);
       String name=in.next();
       String Email=in.next();
       String phone=in.next();
       int id=in.nextInt();
       
       Player player1=new Player(name,Email,id,phone);
       
      System.out.println("Welcome Owner please enter your inforamtion in this order Name,ID,Email,Phone");
       String nameOwner=in.next();
       String EmailOwner=in.next();
       String phoneOwner=in.next();
       int idOwner=in.nextInt();

       PlayGroundOwner Owner1=new PlayGroundOwner(nameOwner,EmailOwner,idOwner,phoneOwner); 
       //above this comment to comment is first requierment :   registering a user (playground owner or player) 

       
    
       //Second Requierment :adding a playground and its available times and price
       System.out.println("Welcome Owner please enter playground inforamtion in this order Name,size,location,price,avaliableHours(in this format 1-2,13-14)");
       String namePlayGround=in.next();
       String size=in.next();
       String locationPlayGround=in.next();
       String avaliableHoursPlayGround=in.next();
       int price=in.nextInt();
       Owner1.getPlayGround().setAvailableHours(avaliableHoursPlayGround);
       Owner1.getPlayGround().setLocation(locationPlayGround);
       Owner1.getPlayGround().setSize(size);
       Owner1.getPlayGround().setName(namePlayGround);
       Owner1.getPlayGround().setPrice(price);
       
       //above this comment to comment(Second Requierment ) is Second Requierment :adding a playground and its available times and price

    
       
      //Third Requierment:booking a time slot on the playground
      System.out.println("Welcome player you can Book playground but please Selece slot from these slots");
      
      player1.getBook().displayAvailableHours();
      String selectSlot=in.next();
      player1.getBook().selectAvailableHours(selectSlot);
      System.out.println("YOUR SLOT IS "+player1.getBook().getSlot());
      //above this comment to comment(Third Requierment ) is Second Requierment :adding a playground and its available times and price
        
    //book.displayAvailableHours(); //hence we need show when we select slot system update and emove this selcet from avaliableHoursPlayGround
    }

}
