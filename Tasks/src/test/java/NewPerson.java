public class NewPerson {
    int age;
    String namePerson;
    public NewPerson() {

    }

    public NewPerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public NewPerson(int age, String namePerson) {
        this.age = age;
        this.namePerson = namePerson;
    }
    String newNamePerson;
    public void newRename(String newNamePerson){
        this.namePerson = newNamePerson;

    }



}
