public class StillPerson {
    int age;
    String name;

    public StillPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }



//    int newAge;
//    String newName;
    public StillPerson creatingNewPersona(int newAge,String newName){
        age = newAge;
        name = newName;
        return this;

    }

}

