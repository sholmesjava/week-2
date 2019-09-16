
public class Photo {
	private float height;
	private float width;
	
	
	public Photo() {
		height = 0;
		width = 0;
	}
	
	public Photo (float height, float width) {
		this.height = height;
		this.width = height;
	}
	
	public Photo (Photo obj) {
		this.height = obj.height;
		this.width = obj.width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
}
