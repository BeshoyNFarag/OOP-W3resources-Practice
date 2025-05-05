

public class Document implements Searchable{
    private String doc;

    public Document(String doc){
        this.doc = doc;
    }


    public void search(String keyword){
        System.out.println(doc.contains(keyword));
    }
}
