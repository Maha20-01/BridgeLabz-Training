package level1;

class Item{
	
	int Itemcode;
	String Itemname;
	float price;
	int quantity;
	
	Item( int i, String s,float p,int q){
		Itemcode=i;
		Itemname=s;
		price=p;
		quantity=q;
	}
	
	float display() {
		return price*quantity;
	}
	
	
}


public class TrackInventory {
public static void main(String[] args) {
	Item i1=new Item(101,"maggi",10,3);
	System.out.println("Itemcode ="+ i1.Itemcode);
	System.out.println("Itemname ="+ i1.Itemname);
	System.out.println("price ="+ i1.price);
	System.out.println("quantity ="+ i1.quantity);
	System.out.print("Total  cost ="+ i1.display());

	


	
	
}
}
