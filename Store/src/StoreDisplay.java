
public class StoreDisplay {

	public static void main(String[] args) {
		
		Item laptop = new Laptop("HP" , 500 , 5);
		Item tv = new TV ("Samsung" , 400 , 10);
		Item phone = new Phone ("LG" , 250 , 8);
		
		
		Item[] items = {laptop , tv , phone};
		

		Store krishnaElectronics = new Store(items);
		
		krishnaElectronics.displayItem(items);
		

	}

}
