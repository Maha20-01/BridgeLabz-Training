package level2;
 class Items{
	 String itemName;
	 int price;
	 int quantity;
	 
 
	 Items(String s ,int p, int q ){
    	 itemName=s;
    	 price=p;
    	 quantity=q;
     }
    void addItem(int num)
    {
    	quantity=quantity+num;
    }
    void removeItem(int num) {
    	quantity=quantity-num;

    }
    int total() {
    	int tot;
    	tot= price*quantity;
    	return tot;
    }
    
    
    void display() {
    	System.out.println("Item name = "+itemName);
    	System.out.println("Item price = "+price);
    	System.out.println("Item quantity = "+quantity);
    	System.out.println("total= "+total());


    }

 }


public class CartItem {
public static void main(String[] args) {
	Items i1=new Items("chocolate",60,4);
	i1.display();
	i1.addItem(2);
	i1.display();
	i1.removeItem(2);
	i1.display();

}
}
