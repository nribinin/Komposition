public class PalletLocation implements LocationDescriptor{

    private int palletNumber;

    public PalletLocation(int palletNumber){
        this.palletNumber = palletNumber;
    }

    public int getPalletNumber(){
        return this.palletNumber;
    }
    @Override
    public String getType() {
        return "Pallet";
    }

    @Override
    public String getLocation() {
        return "Palette: " + this.palletNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PalletLocation that = (PalletLocation) o;
        return this.palletNumber == that.palletNumber;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        Integer palettei = this.palletNumber;
        result = prime * result + palettei.hashCode();
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
        PalletLocation palletcast = (PalletLocation) o;
        int ret = getPalletNumber() - palletcast.getPalletNumber();
        if(ret != 0){
            return ret;
        }

        return 0;
    }
}
