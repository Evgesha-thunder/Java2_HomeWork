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












