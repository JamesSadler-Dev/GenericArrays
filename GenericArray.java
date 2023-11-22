import java.util.Arrays;

public class GenericArray<T>{
    transient private Object[] elementData = {};

    GenericArray(int size){
        this.elementData = new Object[size];
    }

    public void set(int index,T element){
        if (index < elementData.length || index > 0){
            this.elementData[index] = element;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if (index < elementData.length || index > 0){
            return (T) elementData[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString(){
        return Arrays.toString(elementData);
    }

}



