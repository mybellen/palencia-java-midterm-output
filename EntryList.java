
import java.util.ArrayList;

public class EntryList {
    private ArrayList<String> nameList = new ArrayList<String>();
    private ArrayList<Integer> ageList = new ArrayList<Integer>();
    
    public void addEntryList(String name, int age) {
    	nameList.add(name); 
    	ageList.add(age);
    }

    public void printEntryList() {
        System.out.println("You have " + nameList.size() + " items in your entry list");
        for(int i=0; i< nameList.size(); i++) {
            System.out.println((i+1) + ". " + nameList.get(i) +" is" + " "+ ageList.get(i));
        }
    }

    public void updateEntryList(String nameNew, int ageNew) {
    	nameList.add(nameNew);
    	ageList.add(ageNew);
    }

    public void removeEntryList(int position) {
        String list = nameList.get(position);
        nameList.remove(position);
        ageList.remove(position);
    }
    
}