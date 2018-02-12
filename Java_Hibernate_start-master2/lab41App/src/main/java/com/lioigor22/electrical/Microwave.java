package com.lioigor22.electrical;

public class Microwave extends ElectricalAppliance {

	private String name;
	private long timerMillis;
	private long startTime;
	private boolean rotate;

	public Microwave() {

	}

	public Microwave(boolean pluggedIn, double voltage, double amperage, long timer, boolean rotate) {

		super(pluggedIn, voltage, amperage);
		this.timerMillis = timer;
		this.rotate = rotate;
		startTime = 0;

	}

	public Microwave(String name) {

		this.name = name;
	}

	public void startCook() throws Exception {
		if (super.getPluggedIn() == false) {
			throw new Exception("Microwave not plugged in!!! Please, plug in and try again!");
		} else if (startTime != 0) {
			throw new Exception("Now is the cooking process, click Cancel or wait!");
		} else
			startTime = System.currentTimeMillis();

	}

	public void cancel() {
		startTime = 0;
	}

	public boolean isCooked() {
		if (startTime == 0) {
			return false;
		} else {
			long finishTime = System.currentTimeMillis();
			long resultTime = finishTime - startTime;
			if (resultTime > timerMillis) {
				startTime = 0;
				return true;
			} else
				return false;
		}

	}

	public long getTimerMillis() {
		return timerMillis;
	}

	public void setTimerMillis(long timerMillis) {
		this.timerMillis = timerMillis;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public boolean isRotate() {
		return rotate;
	}

	public void setRotate(boolean rotate) {
		this.rotate = rotate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (rotate ? 1231 : 1237);
		result = prime * result + (int) (startTime ^ (startTime >>> 32));
		result = prime * result + (int) (timerMillis ^ (timerMillis >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Microwave other = (Microwave) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rotate != other.rotate)
			return false;
		if (startTime != other.startTime)
			return false;
		if (timerMillis != other.timerMillis)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Microwave [name=" + name + ", timerMillis=" + timerMillis + ", startTime=" + startTime + ", rotate="
				+ rotate + ", PluggedIn=" + getPluggedIn() + ", Voltage=" + getVoltage() + ", Amperage=" + getAmperage()
				+ ", Id=" + getId() + "]";
	}

}
