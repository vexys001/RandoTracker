import java.util.ArrayList;

public class ItemList{
    
    private ArrayList<Item> items;

    public ItemList(){
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public int getNumbItems(){
        return this.items.size();
    }

    public Item getItem(int i){
        return this.items.get(i);
    }

    public void AddItem(Item pItem){
        this.items.add(pItem);
    }
    public void removeItem(Item pItem){
        this.items.remove(pItem);
    }
}