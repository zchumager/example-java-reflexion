package mx.ssf.test;

public interface Eatable {
	public abstract String getType();
	public abstract void cooking(float time, float celciusDegress);
	public abstract float getPreparation_percentage();
}
