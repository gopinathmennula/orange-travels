package orange travels.contrib;

import java.util.Objects;

import orange travels.Contribution;

public abstract class AbstractContribution implements Contribution {

	@Override
	public int hashCode() {
		return 37 * (getDisplayName() == null ? 3 : getDisplayName().hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AbstractContribution that = (AbstractContribution) obj;
		if (!Objects.equals(getDisplayName(), that.getDisplayName())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getDisplayName();
	}

}
