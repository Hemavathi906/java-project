public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Data d=new Data();
        d.setId(12);
        d.setPassword("Hema");
        System.out.println("id is" +""+  d.getId());
        System.out.println("password is" + ""+d.getPassword());


    }


}
class Data{
    private int id;
    private String password;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    

}
