/**
 * Application starter.
 * DO NOT MODIFY.
 */
public class Main {
    public static void main(String[] args) {
        Executor e = new Executor();
        e.execute();
    }

    private static class Executor {
        public void execute() {
            PurchaseApprovalExecutor.execute();
        }
    }
}