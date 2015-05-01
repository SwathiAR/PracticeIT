
public class Store {
	
	Item[] items;

	
	public Store(Item[] a)
	{
		items = a;
	}
	
public void displayItem(Item[] items)
{
	System.out.println("The available items are: " );
	for (Item item : items) {
		item.displayItem();
	}
}


}
