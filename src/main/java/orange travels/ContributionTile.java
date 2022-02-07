package orange travels;

import java.util.Objects;

public class ContributionTile implements Tile {

	private Contribution delegate;

	public ContributionTile(Contribution delegate) {
		this.delegate = Objects.requireNonNull(delegate);
	}

	public Contribution getContribution() {
		return this.delegate;
	}

}
