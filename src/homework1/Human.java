package homework1;

public class Human implements RunTrackWall{

    private float maxDistance = 7.8f;
    private float maxHeight = 1.5f;
    String name = "Рони";


    @Override
    public Boolean run(float distance) {
        if (maxDistance >= distance) {
            System.out.println("Человек " + name + " пробежал " + distance + " метров");
            return true;

        }else {
            System.out.println("Человек  " + name + " не смог пробежать " + distance + " метров соревнование окончено");
            return false;
        }

    }

    @Override
    public Boolean jump(float height) {
        if (maxHeight >= height) {
            System.out.println("Человек " + name + " прыгнул " + height + " метров");
            return true;


        }else {
            System.out.println("Человек " + name + " не смог прыгнуть " + height + " метров  соревнование окончено" );
            return false;

        }

    }

    }
class Cat implements RunTrackWall {
    private float maxDistance = 5.4f;
    private float maxHeight = 2.3f;
    String name = "Рождер";



    @Override
    public Boolean run(float distance) {
        if (maxDistance >= distance) {
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
            return true;

        }else {
            System.out.println("Кот " + name + " не смог пробежать  "+ distance + " метров  соревнование окончено");
            return false;
        }

    }

    @Override
    public Boolean jump ( float height){
        if (maxHeight >= height) {
            System.out.println("Кот  " + name + " прыгнул " + height + " метров");
            return true;

        }else {
            System.out.println("Кот " + name + " не смог прыгнуть " + height + " метров  соревнование окончено");
            return false;
        }

    }
}
 class Robot implements RunTrackWall{
    private float maxDistance = 10.4f;
    private float maxHeight = 3.5f;
    String name= "Бионик";



    @Override
    public Boolean run(float distance) {
        if (maxDistance >= distance) {
            System.out.println("Робот " + name + " пробежал " + distance + " метров");
            return true;

        }else {
            System.out.println("Робот " + name + " не смог пробежать " + distance + " метров соревнование окончено");
            return false;
        }


    }

    @Override
    public Boolean jump(float height) {
        if (maxHeight >= height) {
            System.out.println("Робот " + name + " прыгнул " + height + " метров");
            return true;


        }else {
            System.out.println("Робот " + name + " не смог прыгнуть " + height + " метров соревнование окончено" );
            return false;
        }

    }
     public static class Main {
         public static void main(String[] args) {
             RunTrackWall[] runTracks = {new Cat(), new Robot(), new Human()};
             for (RunTrackWall obj : runTracks) {
                 if (obj.jump(3.5f)) {
                     obj.run(8.7f);
                 } else {
                     System.out.println("Спектакль окончен , существо себя исчерпало");
                 }
                 {

                 }

             }
         }
     }


 }





