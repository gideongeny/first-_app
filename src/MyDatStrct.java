import java.util.HashMap;

public class MyDatStrct {
    String[] names;
    HashMap<String,Integer> ages;
    HashMap<String,String> person;

    public void setNames(){
        names = new String[3];
        names[0]="john";
        names[1]="jane";
        names[2]="jack";

        System.out.println(names[0]);
    }
    public void setPerson(){
        person = new HashMap();
        person.put("name","John");
        person.put("age","25");
        System.out.println(person.get("name"));
    }

    public  void setAges(){
        ages = new HashMap();
        ages.put("age",25);
        ages.put("age1",26);
        System.out.println(ages.get("age1"));
    }

}
