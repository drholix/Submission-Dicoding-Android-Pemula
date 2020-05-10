package id.awan.topanime2020;

import java.util.ArrayList;

public class AnimeData {
    public static String[] heroNames = {
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

    private static String[] heroDetails = {
            "Second season of Kaguya-sama wa Kokurasetai: Tensai-tachi no Renai Zunousen.",
            "Third season of Kingdom.",
            "Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun,",
            "Toaru Kagaku no Railgun T brings back the Tokiwadai Ace and her friends as they dive deeper into the dark side of Academy City. From terrorist attacks to ruthless underground projects, anything is possible in this city.",
            "A year has passed since Tooru Honda began living in the Souma residence, and she has since created stronger relationships with its inhabitants Shigure, Kyou, and Yuki. She has also grown closer to the rest of the Souma family and has become familiar with their ancestral secret, having helped them with many of their personal issues.",
            "Shinichi Kudou, a high school student of astounding talent in detective work, is well known for having solved several challenging cases. One day, when Shinichi spots two suspicious men and decides to follow them, he inadvertently becomes witness to a disturbing illegal activity.",
            "There is a tower that summons chosen people called \"Regulars\" with the promise of granting their deepest desires. Whether it be wealth, fame, authority, or something that surpasses them all—everything awaits those who reach the top.",
            "Most people would prefer being the protagonist of a world full of adventure, be it in a game or in another world. But, unfortunately, a certain girl is not so lucky. Regaining the memories of her past life, she realizes that she was reborn in the world of Fortune Lover—one of the games she used to play.",
            "Second half of Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen.",
            "Asta and Yuno were abandoned at the same church on the same day. Raised together as children, they came to know of the \"Wizard King\"—a title given to the strongest mage in the kingdom—and promised that they would compete against each other for the position of the next Wizard King. However, as they grew up, the stark difference between them became evident. While Yuno is able to wield magic with amazing power and control, Asta cannot use magic at all and desperately tries to awaken his powers by training physically.",
            "After college, Rikuo Uozumi, a boy without much ambition in life, takes on a job at a convenience store. The days pass by uneventfully for Rikuo until he meets his former girlfriend and classmate, but especially thanks to the unusual Haru Nonaka, and her pet raven..."
    };

    private static int[] heroesImages = {
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

    static ArrayList<Anime> getListData() {
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Anime hero = new Anime();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}

