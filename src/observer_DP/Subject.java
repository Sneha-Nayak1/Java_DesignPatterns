package observer_DP;

public interface Subject {
	void register(Observer ob);
	void deregister(Observer ob);
	void notifyPeople();
}
