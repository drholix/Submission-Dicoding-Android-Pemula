package id.awan.topanime2020;

import java.util.ArrayList;

public class AnimeData {
    public static String[] animeNames = {
            "Kaguya-sama Love is War Season 2",
            "Kingdom 3rd Season",
            "One Piece",
            "Toaru Kagaku no Railgun T",
            "Fruits Basket 2nd Season",
            "Detective Conan",
            "Tower of God",
            "My Next Life as a Villainess",
            "Ascendance of a Bookworm Part 2",
            "Black Clover",
            "Yesterday wo Utatte"
    };

    private static String[] animeDetails = {
            "On Kaguya's words, Ai switches Miyuki's coffee for a decaffeinated version, causing him to fall asleep; to Kaguya's chagrin, he sleeps on her shoulder, causing her to ask Ai to prevent anyone from entering the Student Council room. Nagisa's boyfriend approaches Miyuki and Yu for further romantic advice, though the two—later joined by Kaguya and Chika—watch in disbelief when the couple begin engaging in suggestive acts. The Student Council plays a board game created by Chika. With Miyuki's birthday on the horizon, Kaguya tries to coerce him into publicly revealing the date via horoscopes.",
            "Born during the Warring States period of ancient China, Xin and Piao are war-orphans working as servants in a poor village in the kingdom of Qin. However they dream of becoming \"Great Generals of the Heavens\" and train daily. One day, Piao is taken to the palace for an unknown purpose by a minister and Xin is left behind.",
            "Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun,",
            "The Daihasei Festival has begun, and that of course means that Tokiwadai Middle School—a prestigious all-girls' middle school—is competing too. Despite the participation of the \"Ace of Tokiwadai,\" Mikoto Misaka, the other students who are participating are still putting their utmost effort into winning, no matter how the impossible feat may seem against her might.",
            "A year has passed since Tooru Honda began living in the Souma residence, and she has since created stronger relationships with its inhabitants Shigure, Kyou, and Yuki. She has also grown closer to the rest of the Souma family and has become familiar with their ancestral secret, having helped them with many of their personal issues.",
            "Shinichi Kudou, a high school student of astounding talent in detective work, is well known for having solved several challenging cases. One day, when Shinichi spots two suspicious men and decides to follow them, he inadvertently becomes witness to a disturbing illegal activity. Unfortunately, he is caught in the act, so the men dose him with an experimental drug formulated by their criminal organization, leaving him to his death. However, to his own astonishment, Shinichi lives to see another day, but now in the body of a seven-year-old child.",
            "There is a tower that summons chosen people called \"Regulars\" with the promise of granting their deepest desires. Whether it be wealth, fame, authority, or something that surpasses them all—everything awaits those who reach the top. wenty-Fifth Bam is a boy who had only known a dark cave, a dirty cloth, and an unreachable light his entire life. So when a girl named Rachel came to him through the light, his entire world changed. Becoming close friends with Rachel, he learned various things about the outside world from her. But when Rachel says she must leave him to climb the Tower, his world shatters around him.",
            "Most people would prefer being the protagonist of a world full of adventure, be it in a game or in another world. But, unfortunately, a certain girl is not so lucky. Regaining the memories of her past life, she realizes that she was reborn in the world of Fortune Lover—one of the games she used to play.Unfortunately, the character she was reincarnated into—Katarina Claes—is the game's main antagonist, who faces utter doom in every ending. Using her extensive knowledge of the game, she takes it upon herself to escape from the chains of this accursed destiny.",
            "The story follows Motosu Urano, a book-loving post-secondary student and soon-to-be librarian who ends up crushed to death beneath a pile of books during an earthquake. With her dying breath, she wishes to be reincarnated in a world where she can read books forever. Urano awakens in the body of a weak, five-year-old girl named Myne in a world where books are scarce and only available to elites. Myne, retaining her memories from her previous life, decides to create and print her own books so that she can read again.",
            "Asta and Yuno were abandoned at the same church on the same day. Raised together as children, they came to know of the \"Wizard King\"—a title given to the strongest mage in the kingdom—and promised that they would compete against each other for the position of the next Wizard King. However, as they grew up, the stark difference between them became evident. While Yuno is able to wield magic with amazing power and control, Asta cannot use magic at all and desperately tries to awaken his powers by training physically.",
            "After college, Rikuo Uozumi, a boy without much ambition in life, takes on a job at a convenience store. The days pass by uneventfully for Rikuo until he meets his former girlfriend and classmate, but especially thanks to the unusual Haru Nonaka, and her pet raven..."
    };

    private static int[] animeImages = {
            R.drawable.kaguya_sama_love_is_war_season_2,
            R.drawable.kingdom_3rd_season,
            R.drawable.one_piece,
            R.drawable.toaru_kagaku_no_railgun_t,
            R.drawable.fruits_basket_2nd_season,
            R.drawable.detective_conan,
            R.drawable.tower_of_god,
            R.drawable.my_next_life_as_a_villainess,
            R.drawable.ascendance_of_a_bookworm_part2,
            R.drawable.black_clover,
            R.drawable.yesterday_wo_utatte
    };
    private static String[] animeEpisodes = {
            "Episodes: 12",
            "Episodes: Unknown",
            "Episodes: Unknown",
            "Episodes: 25",
            "Episodes: Unknown",
            "Episodes: Unknown",
            "Episodes: 13",
            "Episodes: 12",
            "Episodes: 12",
            "Episodes: Unknown",
            "Episodes: 18"
    };
    private static String[] animeScores = {
            "Score 8.83",
            "Score 8.60",
            "Score 8.48",
            "Score 8.22",
            "Score 8.20",
            "Score 8.19",
            "Score 8.06",
            "Score 7.84",
            "Score 8.04",
            "Score 7.20",
            "Score 7.84"
    };



    static ArrayList<Anime> getListData() {
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < animeNames.length; position++) {
            Anime hero = new Anime();
            hero.setName(animeNames[position]);
            hero.setDetail(animeDetails[position]);
            hero.setPhoto(animeImages[position]);
            hero.setScore(animeScores[position]);
            hero.setEpisodes(animeEpisodes[position]);
            list.add(hero);
        }
        return list;
    }
}

