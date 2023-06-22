public class OffByN implements CharacterComparator{
    private int n;
    public OffByN(int n_value){
        n=n_value;
    }

    @Override
    public boolean equalChars(char x, char y){
        return (Math.abs(y-x)==n);
    }
}
