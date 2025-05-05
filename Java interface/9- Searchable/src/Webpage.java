


public class Webpage implements Searchable{


    private String web;


    public Webpage(String web){
        this.web = web;
    }

    public void search(String keyword) {

        System.out.println(web.contains(keyword));
    }
}
