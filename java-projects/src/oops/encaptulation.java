package oops;
class Car{
        private String name;
        public String getName(){
            return name;
        } 
        public void setName(String name){
            this.name = name;
        }
}
public class encaptulation {
    public static void main(String[] args){
        Car obj=new Car();
    obj.setName("Safari");
    System.out.println("This is my "+obj.getName());
    }

}
