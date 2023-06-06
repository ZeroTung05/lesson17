public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setNameAndAge("Андрей ",20);
        String s1 =" Александр";

        Person person2 = new Person();
        person2.setNameAndAge(s1,30);

        person1.speak();
        person2.speak();
    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;

    }
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){ // void это возвращает ничто
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут" + name + ",мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("привет");
    }
}