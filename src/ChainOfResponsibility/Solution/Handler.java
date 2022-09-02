package ChainOfResponsibility.Solution;

public abstract class Handler {
    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public boolean handle() {
        if(!doHandle())
            return false;

        return next != null ? next.handle() : true;
    }

     abstract boolean doHandle();
}
