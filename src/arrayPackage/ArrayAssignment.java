package arrayPackage;

public class ArrayAssignment {

    public static void main(String[] args) {





    }

//    class Animal{
//
//        String animalName;
//        String animalColor;
//        int animalCount;
//        String animalCategory;
//
//        public int getAnimalCount(){
//
//
//            retrun animalCount;
//        }


        class User {
            int id;
            String name;

            public User(int id, String name) {
                this.id = id;
                this.name = name;
            }

            int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;

                User abc = new User(10,"ssa");

                System.out.println(abc.getId());

            }
        }




    }







