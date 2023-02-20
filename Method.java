public enum Method {

    Flee("Flee to the safe place"),
    Attack("Attack the opponent"),
    ViewInventory("View your weapon inventory"),
    MoveEast("Move to East"),
    MoveWest("Move to West"),
    MoveSouth("Move to South"),
    MoveNorth("Move to North"),
    Shivam("My Action");

    private String methodName;

    Method(String methodName){
        this.methodName = methodName;
    }

    public String getMethodName(){
        return  methodName;
    }
}
