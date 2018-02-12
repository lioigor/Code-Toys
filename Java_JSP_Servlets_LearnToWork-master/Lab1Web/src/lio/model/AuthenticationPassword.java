package lio.model;

public class AuthenticationPassword {

	private String originalPassword;

	public AuthenticationPassword(String originalPassword) {

		this.originalPassword = originalPassword;

	}

	public boolean validate(String permissionValue) {

		if (this.originalPassword.equals(permissionValue))
			return true;
		else
			return false;
	}

	public void setPassword(String value) {
		this.originalPassword = value;
	}

	public String getPassword() {

		return this.originalPassword;
	}

	@Override
	public String toString() {
		return "AuthenticationPassword [originalPassword=" + originalPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((originalPassword == null) ? 0 : originalPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthenticationPassword other = (AuthenticationPassword) obj;
		if (originalPassword == null) {
			if (other.originalPassword != null)
				return false;
		} else if (!originalPassword.equals(other.originalPassword))
			return false;
		return true;
	}

}
