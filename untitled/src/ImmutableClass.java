public final class ImmutableClass {
    private final int first;
    private final int second;

    public ImmutableClass(int first, int second){
        this.first = first;
        this.second = second;

    }
    public int getFirst(){
        return this.first;
    }
    public int getSecond(){
        return this.second;
    }
    public int add(){
        return this.first + this.second;
    }
}
