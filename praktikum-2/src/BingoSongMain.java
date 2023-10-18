public class BingoSongMain {
    public static void main(String[] args) {
        String[] lyrics = {
                "B-I-N-G-O",
                "(clap)-I-N-G-O",
                "(clap)-(clap)-N-G-O",
                "(clap)-(clap)-(clap)-G-O",
                "(clap)-(clap)-(clap)-(clap)-O",
                "(clap)-(clap)-(clap)-(clap)-(clap)"
        };

        BingoSong singing = new BingoSong(lyrics);
        singing.lyrical();
    }
}
