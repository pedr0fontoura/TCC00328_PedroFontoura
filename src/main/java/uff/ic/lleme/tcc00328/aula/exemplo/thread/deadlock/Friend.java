package uff.ic.lleme.tcc00328.aula.exemplo.thread.deadlock;

/**
 *
 * @author lapaesleme
 */
class Friend {

    private final String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void bow(Friend bower) {
        System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
        bower.bowBack(this);
    }

    public synchronized void bowBack(Friend bower) {
        System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
    }

}
