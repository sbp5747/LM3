public class Flee  extends Action{
    public Flee(String name){
        super(Method.Flee, name, 'f', null);
    }
    public String someSpecialAction(){
        return "This is my special Flee Action";
    }
}
