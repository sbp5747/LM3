
public class Action {
    // Class variables
    private Method method;
    private char hotkey;
    private String name;
    private Enemy kwargs;

    public Action(Method method, String name, char hotkey, Enemy kwargs){
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
    }

    public String str(){
        return  hotkey + ": " + name;
    }

    public String toString(){
        return String.format("\nAction: %s\n===============\nMethod: %s\nHotkey: %s\nEnemy: %s",
                this.name, this.method.getMethodName(),this.hotkey, this.kwargs);
    }

}
