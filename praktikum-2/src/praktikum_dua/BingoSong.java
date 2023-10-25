package praktikum_dua;

interface BingoInterface {
    void lyrical();
}
class BingoSong implements BingoInterface{
    String[] bingo;

    public BingoSong(String[] bingo) {
        this.bingo = bingo;
    }

    //@Override
    public void lyrical() {

        for (int i = 0; i < 6; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int j = 0; j < 3; j++) {
                System.out.println(bingo[i]);
            }
//            if (i < 5) {
//                System.out.println(bingo[i]);
//            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}



