
public class House {
	private int id;
	private float price;
	private String location;
	private String advertiser;
	private Photo image;
	
	public House() {
		id = 0;
		price = 0;
		location = "";
		advertiser = "";
		image = new Photo();
	}
	
	public House (int id, float price, String location, String advertiser, Photo image) {
		this.id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	}
	
	public House (House obj) {
		this.id = obj.id;
		this.price = obj.price;
		this.location = obj.location;
		this.advertiser = obj.advertiser;
		this.image = obj.image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo image) {
		this.image = image;
	}
	
	public String toString(){
		  return id+" "+price+" "+location+" "+advertiser+" "+image;
		 }
}
