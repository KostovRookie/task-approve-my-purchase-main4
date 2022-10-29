package handlers;
import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    @Override
    public void approve(int id, int cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " requires an approval of executive meeting.");
        next.approve(id, cost, type);

    }

    @Override
    protected boolean canApprove(int id, int cost, Type type) {
        boolean b = true;
        if (type == Type.CONSUMABLES && cost <= 1000) {
            return b;
        } else if (type == Type.CLERICAL && cost <= 2000) {
            return false;
        } else if (type == Type.GADGETS && cost <= 3000) {
            return b;
        } else if (type == Type.GAMING && cost <= 5000) {
            return b;
        } else return type == Type.PC && cost <= 8000;

    }
}
