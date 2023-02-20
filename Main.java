import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//fleeNorth object
        Action fleeNorth = new Flee("Flee North");

//viewInventory object
        Action viewInventory = new ViewInventory();
//moveEast object
        Action slowMoveEast = new MoveEast("Slow Move East");
//moveWest object
        Action twoStepMoveWest = new MoveWest("Two Step Move West");
//moveNorth object
        Action threeStepMoveNorth = new MoveNorth("Three Step Move North");
//moveSouth object
        Action fastMoveSouth = new MoveSouth("Fast Move South");
//myAction object
        Action myAttack = new Shivam();
//add objects in an Array List
        List<Action> actions = new ArrayList<>();
        actions.add(fleeNorth);
        actions.add(viewInventory);
        actions.add(threeStepMoveNorth);
        actions.add(fastMoveSouth);
        actions.add(slowMoveEast);
        actions.add(twoStepMoveWest);
        actions.add(myAttack);
//print objects from Array List
        for (Action action : actions) {
            System.out.println(action);
        }
//print Special Action for myAction
        System.out.println( ((Shivam)myAttack).someSpecialAction() );
    }
}