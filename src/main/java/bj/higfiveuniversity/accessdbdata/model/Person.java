 @Entity
 public class Person {
    @id
    @GeneratedValue(strategy = GeneraType.Auto)
    private long id;
    private String firstName;
    private String  lasttName;


    public String getFirstName(){
        return firstName;
    }
    public void setFirstName( String firstName){
       this.firstName = firstName;
    }
    public String getLasttName(){
        return  lasttName;
    }
    public String setLasttName(String  lasttName){
        this.lastName = lasttName;
    }


 }