package handlers;

import common.Type;

import java.util.Random;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {

    @Override
    public void approve(int id, int cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Executives at Prime Holding Ltd approved purchase with id " + id + " that costs " + cost);
            System.out.println();

        } else {
            System.out.println("Purchase with id " + id + " that costs " + cost + " did not receive approval of executive meeting in Prime Holding ltd.");
            System.out.println();
        }
    }

    @Override
    protected boolean canApprove(int id, int cost, Type type) {
        Random random = new Random();                // this is something from me, boolean is returned randomly- true or false
        return random.nextBoolean();                 // depending on the value, it will trigger two outcomes for executives at Prime Holding

    }
}

