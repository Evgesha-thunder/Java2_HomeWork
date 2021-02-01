package homework1;

public  class Main {
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