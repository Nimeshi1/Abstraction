abstract class Animal {
        public abstract void animalSound();
        public void sleep() {
            System.out.println(" Sleep sound: Zzz");
        }
    }
    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Test {
        public static void main(String[] args) {
            Pig p = new Pig();
            p.animalSound();
            p.sleep();
        }
    }


