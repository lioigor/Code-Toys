package lioigor22Model;

public class Patient {

	private int id;
	private String surName;
	private String name;
	private String patronymic;
	private String address;
	private int phone;
	private int medicalCard;
	private String diagnosis;
	
	public Patient(int id, String surName, String name, String patronymic, String address, int phone, int medicalCard, String diagnosis){
		
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.phone = phone;
		this.medicalCard = medicalCard;
		this.diagnosis = diagnosis;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getMedicalCard() {
		return medicalCard;
	}

	public void setMedicalCard(int medicalCard) {
		this.medicalCard = medicalCard;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + id;
		result = prime * result + medicalCard;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + phone;
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
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
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (diagnosis == null) {
			if (other.diagnosis != null)
				return false;
		} else if (!diagnosis.equals(other.diagnosis))
			return false;
		if (id != other.id)
			return false;
		if (medicalCard != other.medicalCard)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (phone != other.phone)
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", surName=" + surName + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", phone=" + phone + ", medicalCard=" + medicalCard + ", diagnosis="
				+ diagnosis + "]";
	}
	
	
}
