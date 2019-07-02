public class Main {

    public static void main(String[] args) {

        Squarelotron squarelotron = new Squarelotron(5);

        squarelotron.buildSquare();

        System.out.println();
        System.out.println();

        squarelotron.upSideDownFlip();

        System.out.println();
        System.out.println();

        squarelotron.mainDiagonalFlip();

        System.out.println();
        System.out.println();

        squarelotron.rotateRight(1);

    }
}
