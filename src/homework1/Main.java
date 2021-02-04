package homework1;

public class Main {
    private static void Array(String array[][]) throws MyArraySizeException {
        if (array.length < 4 || array.length > 4) {
            throw new MyArraySizeException("Не верный размер массива");

        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length > 4 || array[i].length < 4) {

                    throw new MyArraySizeException("Не верный размер массива");
                }


            }

        }
    }

  private static void SumElement(String array[][]) {
        int summ = 0;
        for (int j = 0; j < array.length; j++) {
            for (int y = 0; y < array[j].length; y++) {


                int arr = Integer.parseInt(array[j][y].trim());
                summ = summ + arr;
            }
            System.out.println(summ);
            summ = 0;

        }

    }


    public static void main(String[] args) {
        String strings[][] = new String[4][4];


        try {
            SumElement(strings);
        }catch (MaArrayDataException e){
            System.out.println(e.getCause());
        }
        try {
            Array(strings);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }

}


