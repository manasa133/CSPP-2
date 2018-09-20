import java.util.*;
class Person implements Comparable{
	private String name;
	private ArrayList<String> friends;
	Person(String name, String[] followers){
		this.name = name;
		this.friends =  new ArrayList<String>(Arrays.asList(followers));
	}
	public String getName(){
		return this.name;
	}
	public ArrayList<String> getFriends(){
		return this.friends;
	}

	@Override
    public int compareTo(Object o) {
        Person e = (Person) o;
        return name.compareTo(e.name);
    }
    public String toString(){

    	return this.name+":"+friends;
    }
}
class SocialNetwork {
	private ArrayList<Person> users;
	SocialNetwork(){
		users = new ArrayList<Person>();
	}

	 void addConnection(String user, String follower){
	 	if(getConnections(follower)==null){
	 		System.out.println("Not a user in Network");
	 		return;
	 	}
	 	for(Person p : users){
	 		if(p.getName().equals(user)){
	 			p.getFriends().add(follower);
	 		}
	 	}
	 }
	 void addUser(Person p){
	 	users.add(p);
	 }
	 void displayNetwork(){
	 	Person[] temp = users.toArray(new Person[users.size()]);
	 	Arrays.sort(temp);
	 	for(Person p : temp){
	 		System.out.print(p);
	 		System.out.print(",");
	 	}
	 	System.out.println();
	 }
	 ArrayList<String> getConnections(String name){
	 	for(Person p : users){
	 		if(p.getName().equals(name)){
	 			//System.out.println(p.friends);
	 			return p.getFriends();
	 		}
	 	}
	 	return null;
	 }
	 void commonConnections(String name1, String name2){
	 	ArrayList<String> one = getConnections(name1);
	 	ArrayList<String> two = getConnections(name2);
	 	ArrayList<String> common = new ArrayList();
	 	for(String e : one){
	 		for(String i : two){
	 			if(e.equals(i)){
	 				common.add(e);
	 			}
	 		}
	 	}
	 	if(common.size()==0){
	 		System.out.println("[]");
	 		return;
	 	}
	 	System.out.println(common);
	 }

	 public static void main(String[] args) {
	 	SocialNetwork sn = new SocialNetwork();
	 	Scanner sc = new Scanner(System.in);
	 	while(sc.hasNext()){
	 		String[] tokens1 = sc.nextLine().split(" ");
	 		switch(tokens1[0]){
	 			case "Create":
	 				for(int i =0 ;i< Integer.parseInt(tokens1[1]);i++){
	 					String[] line  =  sc.nextLine().replace(".","").split(" is connected to ");
	 					String[] friends = line[1].split(", ");
	 					sn.addUser(new Person(line[0],friends));
	 				}
	 			break;
	 			case "Network":
	 			sn.displayNetwork();
	 			break;
	 			case "addConnections":
	 				sn.addConnection(tokens1[1],tokens1[2]);
	 				break;
	 			case "getConnections":
	 			if(sn.getConnections(tokens1[1])!=null){
	 				System.out.println(sn.getConnections(tokens1[1]));
	 			}else{
	 				System.out.println("Not a user in Network");
	 			}
	 			break;
	 			case "CommonConnections":
	 				sn.commonConnections(tokens1[1],tokens1[2]);
	 				break;

	 		}
	 	}


	 }

}
