package homework1;


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

