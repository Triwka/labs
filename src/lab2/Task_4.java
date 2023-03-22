package lab2;

public class Task_4 {
    class Person{
        String name;
        int age;
        String sex;
        public Person(String name, int age, String sex){
            setName(name);
            setAge(age);
            setSex(sex);
        }
        void setName(String name){
            this.name = name;
        }
        void setAge(int age){
            this.age = age;
        }
        void setSex(String sex){
            this.sex = sex;
        }
        String getName(){
            return this.name;
        }
        int getAge(){
            return this.age;
        }
        String getSex(){
            return this.sex;
        }
    }
}
