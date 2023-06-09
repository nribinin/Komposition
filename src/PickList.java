import java.util.*;
public class PickList {

    Set<StoredProduct> open;
    Set<StoredProduct> completed;

    public PickList(){
        this.open = new TreeSet<>();
        this.completed = new TreeSet<>();
    }
    public void addItem(StoredProduct item){
        if(item == null){
            throw new IllegalArgumentException("Ungültige Eingabe");
        }
        this.open.add(item);
    }
    public Set<StoredProduct> getOpen(){
        return this.open;
    }
    public Set<StoredProduct> getCompleted(){
        return this.completed;
    }

    public StoredProduct getNext(){
        return this.open.get(this.open.size() -1);
    }

    public void completeNext(){
        this.completed.add(this.open.get(this.open.size() -1));
        this.open.remove(this.open.size() -1);
    }
    @Override
    public String toString(){
        String ausgabe = "Offene Bestellungen: \n";
        for(StoredProduct s : this.open){
            ausgabe += s.toString() + "\n";
        }
        ausgabe += "Abgeschlossene Bestellungen: \n";
        for(StoredProduct s : this.completed){
            ausgabe += s.toString() + "\n";
        }
        return ausgabe;
    }
}
