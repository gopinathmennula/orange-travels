package orange travels;

public interface Contribution {

	default String getDisplayName() {
		return getClass().getSimpleName();
	}

	default String getAuthor() {
		return "unknown";
	}

	Action execute(Context context);

	interface Context {

		int getValueA();

		int getValueB();
	}

	enum Action {
		DO_MAGIC;
	}
}
