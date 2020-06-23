package Z_Java_Tekrar.Polymorphism;

    interface Animals{

        public abstract  void eat();
        public abstract void drink();      
    }

    class  Cat implements Animals{
        private String name;

        @Override
        public  void eat(){
            System.out.println(name+" cat eating");
        }

        @Override
        public void drink() {
            System.out.println(name+ " cat drinking");
            
        }

        public  void eat(String food){
            System.out.println(name+" cat eating " + food);
        }

        void sleep(String place){
            System.out.println(name+" cat is sleeping "+place);
        }

        public void setName(String name) {
            this.name = name;
        }



    }
    
    public class Calisma2 {

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Cat1");
            cat.eat();
            cat.eat("meat");
            cat.drink();
            cat.sleep("bed");
            System.out.println("*****************");

            Animals cat2 = new Cat();
            ((Cat) cat2).setName("Cat2");
            Animals cat3 = new Cat();
            ((Cat) cat3).setName("Cat3");
            Animals cat4 = new Cat();
            ((Cat) cat4).setName("Cat3");
            cat2.drink();
            cat2.eat();
            ((Cat)cat2).eat("banana");
            ((Cat) cat2).sleep("rug");


            Animals[] list = {cat,cat2,cat3,cat4};
            for (Animals each: list) {

               each.eat();
            }
        }
    }
   
        
