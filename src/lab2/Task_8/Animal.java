package lab2.Task_8;

public class Animal {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void doThing() {
        System.out.println("Animal makes sound");
    }

    static class Dog extends Animal {
        String kind;
        String foodType;
        boolean ableFLy;

        public Dog(int age, String name, String kind, String foodType, boolean ableFLy) {
            super(age, name);
            this.kind = kind;
            this.foodType = foodType;
            this.ableFLy = ableFLy;
        }
        public void showInfo(){
            System.out.println(getName() + " " +  getAge() + " " + getKind() + " " + getFoodType() + " " + ableFLy);
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            this.foodType = foodType;
        }

        public boolean isAbleFLy() {
            return ableFLy;
        }

        public void setAbleFLy(boolean ableFLy) {
            this.ableFLy = ableFLy;
        }

        @Override
        public void doThing() {
            System.out.println("Bark");
        }

        public Dog(int age, String name) {
            super(age, name);
        }
    }

    static class Cat extends Animal {
        String kind;
        String foodType;
        boolean ableFLy;

        public Cat(int age, String name, String kind, String foodType, boolean ableFLy) {
            super(age, name);
            this.kind = kind;
            this.foodType = foodType;
            this.ableFLy = ableFLy;
        }
        public void showInfo(){
            System.out.println(getName() + " " +  getAge() + " " + getKind() + " " + getFoodType() + " " + ableFLy);
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            this.foodType = foodType;
        }

        public boolean isAbleFLy() {
            return ableFLy;
        }

        public void setAbleFLy(boolean ableFLy) {
            this.ableFLy = ableFLy;
        }

        @Override
        public void doThing() {
            System.out.println("Meow");
        }

        static class Bird extends Animal {
            String kind;
            String foodType;
            boolean ableFLy;

            public Bird(int age, String name, String kind, String foodType, boolean ableFLy) {
                super(age, name);
                this.kind = kind;
                this.foodType = foodType;
                this.ableFLy = ableFLy;
            }
            public void showInfo(){
                System.out.println(getName() + " " +  getAge() + " " + getKind() + " " + getFoodType() + " " + ableFLy);
            }
            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getFoodType() {
                return foodType;
            }

            public void setFoodType(String foodType) {
                this.foodType = foodType;
            }

            public boolean isAbleFLy() {
                return ableFLy;
            }

            public void setAbleFLy(boolean ableFLy) {
                this.ableFLy = ableFLy;
            }

            @Override
            public void doThing() {
                System.out.println("Tweet");
            }
        }

        public static void main(String[] args) {
            Animal animal = new Animal(12, "Thing");
            Dog dog = new Dog(12, "Drujok", "Dvornyajka", "Balanda", false);
            Bird bird = new Bird(3, "Kesha", "Volnistii","korm", true);
            Cat cat = new Cat(10, "Barsik", "manchkin","korm", false);
            animal.doThing();
            dog.doThing();
            bird.doThing();
            cat.doThing();
            dog.showInfo();
            bird.showInfo();
            cat.showInfo();

        }
    }
}
