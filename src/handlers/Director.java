package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public void approve(int id, int cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, int cost, Type type) {

        if (type == Type.CONSUMABLES) {
            return cost < 500;
        } else if (type == Type.CLERICAL) {
            return cost < 1000;
        } else if (type == Type.GADGETS) {
            return cost < 1500;
        } else if (type == Type.GAMING) {
            return cost < 3500;
        } else if (type == Type.PC) {
            return cost < 6000;
        } else {
            return false;
        }
    }
}
