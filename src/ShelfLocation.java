public class ShelfLocation implements LocationDescriptor{


    private char shelf;
    private int row;
    private int bin;

    public ShelfLocation(char shelf, int row, int bin) {
        this.shelf = shelf;
        this.row = row;
        this.bin = bin;
    }
    public char getShelf() {
        return this.shelf;
    }
    public int getRow() {
        return this.row;
    }
    public int getBin() {
        return this.bin;
    }
    @Override
    public String getType() {
        return "Shelf";
    }

    @Override
    public String getLocation() {
        return "Shelf " + shelf + ", Row " + row + ", Bin " + bin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShelfLocation that = (ShelfLocation) o;
        return shelf == that.shelf && row == that.row && bin == that.bin;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        Character shelfc = this.shelf;
        Integer rowi = this.row;
        Integer bini = this.bin;
        result = prime * result + shelfc.hashCode();
        result = prime * result + rowi.hashCode();
        result = prime * result + bini.hashCode();
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if(o == null){
            return -1;
        }
        if(o == this){
            return 0;
        }
        if(o.equals(this)){
            return 0;
        }
        ShelfLocation shelfcast = (ShelfLocation) o;
        String shelfs = String.valueOf(shelfcast.getShelf());
        int ret = String.valueOf(getShelf()).compareTo(shelfs);
        if(ret != 0){
            return ret;
        }
        ShelfLocation rowcast = (ShelfLocation) o;
        ret = getRow() - rowcast.getRow();
        if(ret != 0){
            return ret;
        }
        ShelfLocation bincast = (ShelfLocation) o;
        ret = getBin() - bincast.getBin();
        if(ret != 0){
            return ret;
        }
        return 0;
    }
}
