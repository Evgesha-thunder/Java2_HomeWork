package homework1;

class Robot implements RunTrackWall {
    private float maxDistance = 10.4f;
    private float maxHeight = 3.5f;
    String name = "Бионик";


    @Override
    public Boolean run(float distance) {
        if (maxDistance >= distance) {
            System.out.println("Робот " + name + " пробежал " + distance + " метров");
            return true;

        } else {
            System.out.println("Робот " + name + " не смог пробежать " + distance + " метров соревнование окончено");
            return false;
        }


    }

    @Override
    public Boolean jump(float height) {
        if (maxHeight >= height) {
            System.out.println("Робот " + name + " прыгнул " + height + " метров");
            return true;


        } else {
            System.out.println("Робот " + name + " не смог прыгнуть " + height + " метров соревнование окончено");
            return false;
        }
    }
}
