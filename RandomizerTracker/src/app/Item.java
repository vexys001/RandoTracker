public class Item {
    private String name;
    private int occurences;
    

    public Item(){
        this.name = "void";
        this.occurences = -1;
    }

    public Item(String pName, int pOcc){
        this.name = pName;
        this.occurences = pOcc;
    }

    public String getName(){
        return(this.name);
    }

    public int getOccurences(){
        return(this.occurences);
    }

    public void setName(String newName){
        if(newName.isEmpty() || newName.length() > 50) throw new Exceptions.InvalidNameException();
        this.name = newName;
    }

    public void setOccurences(int newOcc){
        if(newOcc <=0) throw new Exceptions.InvalidOccuException();
        this.occurences = newOcc;
    }

};