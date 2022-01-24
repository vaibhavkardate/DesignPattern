
package BehavioralDP;


interface Iterator {  
    public boolean hasNext();  
    public Object next();  
}  

interface Container {  
    public Iterator getIterator();  
}

class CollectionofNames implements Container {  
    private String name[]={"Vaibhav kardate", "temp","Rishi Kumar","tarak Mehta","Jethalal gada"};   
       public CollectionofNames()
       {

       }   
    @Override  
        public Iterator getIterator() {  
            return new CollectionofNamesIterate(name) ;  
        }  
}


class CollectionofNamesIterate implements Iterator{  
    int i=0;  
    private String name[];
    public CollectionofNamesIterate(String name[])
    {
        this.name=name;
    }

    @Override  
    public boolean hasNext() {  
        if (i<name.length){  
            return true;  
        }  
        return false;  
    }  
    @Override  
    public Object next() {  
        if(this.hasNext()){  
            return name[i++];  
        }  
        return null;      
    }  
}  



public class IteratorDP
{
    public static void main(String[] args) {
        Container container=new CollectionofNames();
        Iterator iterator= container.getIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}