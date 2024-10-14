
public class Tree<T>{

            private final T[] data = null;

            public T get(int index){
               if(data != null && data.length < index){
                   return data[index];
               }
               throw new IndexOutOfBoundsException();
            }
            public void add(T value){

            }
            public int size(){
                   return 0;
            }
            public int clear(){
                   return 0;
            }
}
