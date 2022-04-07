public class name{
    String nameU;
    String surnameU;
    String numberU;
    int ageU;

    public name(String nme, String surname, int age,String number){
        this.nameU = nme;
        this.surnameU = surname;
        this.ageU = age;
        this.numberU = number;
    }

    void vivod() {
        System.out.println("Name: "+ nameU);
        System.out.println("Surmame: "+ surnameU);
        System.out.println("Age: "+ ageU);
        System.out.println("Number: "+ numberU);
    }


}

