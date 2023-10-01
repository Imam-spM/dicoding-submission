package com.imam.dicoding_ml.datahero

import com.imam.dicoding_ml.R
import com.imam.dicoding_ml.model.ModelHero


object DataHero {
        private val database = arrayOf(
            arrayOf(
                "Claude",
                "Role : Masrkman",
                "Nickname: Knights of Favonius",
                "Claude merupakan salah satu hero marksman terlincah di Mobile Legends. Marksman ini sulit dikuasai karena ia sangat membutuhkan item dan lemah di earlygame. Namun, ketika ia bisa melakukan farm secara bebas, ia akan menjadi marksman yang mempunyai burstdamage, DPS, serta mobilitas yang sangat tinggi.",
                R.drawable.icon_claude,
                R.drawable.claude_bg,
                R.drawable.maskman_role,
            ),
            arrayOf(
                "Freya",
                "Role: Fighter",
                "Nickname: Valkyrie",
                "Freya merupakan hero fighter yang tingkat durabilitasnya sangat tinggi. Bahkan Freya Mobile Legends hampir setara dengan hero tank. Meskipun tidak menggunakan item defense, Freya bisa menahan damage yang cukup besar.\n" +
                        "Freya juga bisa menghasilkan damage yang sakit hanya dengan menggunakan basic attack-nya saja. Dengan tingkat offense yang tinggi, Freya bisa menghabisi hero apapun termasuk tank dengan cepat lho!",
                R.drawable.icon_freya,
                R.drawable.freya_bg,
                R.drawable.fighter_role,
            ),
            arrayOf(
                "Granger",
                "Role: Marskman",
                "Nickname: Death Chanter",
                "Granger adalah Hero yang relatif mudah dipahami. Sebagai Hero Marksman, ia memiliki jarak serangan yang cukup jauh. Granger juga memiliki skill escape, jadi bisa melarikan diri dari musuh. Pada tahap awal permainan, Granger bisa menjadi ancaman besar bagi musuh-musuhnya.",
                R.drawable.icon_granger,
                R.drawable.granger_bg,
                R.drawable.maskman_role,
            ),
            arrayOf(
                "Guinevere",
                "Role: Fighter",
                "Nickname: Ms. Violet",
                "Guinevere adalah salah satu hero fighter yang mengandalkan magic damage di dalam gim Mobile Legends. Guinevere merupakan wanita cantik yang hanya menggunakan tangan kosong saat bertarung. Skill-skill yang dimilikinya sangat cocok untuk digunakan duel satu lawan satu ataupun menghadapi banyak lawan sekaligus.",
                R.drawable.icon_guineverse,
                R.drawable.guinevere_bg,
                R.drawable.fighter_role
            ),
            arrayOf(
                "Gusion",
                "Role: Assasin",
                "Nickname: Holy Blade",
                "Gusion adalah salah satu hero jenis assassin yang ada di dalam gim Mobile Legends. Assassin yang satu ini mengandalkan magic damage untuk mengeliminasi lawan-lawannya. Pergerakannya yang lincah membuat Gusion cukup sulit untuk ditangkap oleh lawan dan dapat mengeliminasi lawan dengan cepat.",
                R.drawable.icon_gusion,
                R.drawable.gusion_bg,
                R.drawable.assasin_role,
            ),
            arrayOf(
                "Kagura",
                "Role: Mage",
                "Nickname: Onmyuji Master",
                "Kagura adalah salah satu Hero Mobile Legends yang merupakan jenis Hero Mage. Kagura juga dikenal sebagai Hero yang memiliki efek burst damage yang bisa diandalkan dari early game hingga late game. Kekuatannya terdapat pada payung yang ia gunakan sebagai senjata, sekaligus menjadi ciri khasnya.",
                R.drawable.icon_kagura,
                R.drawable.kagura_bg,
                R.drawable.mage_role,
            ),
            arrayOf(
                "Layla",
                "Role: Marskman",
                "Nickname: Bunny Babe",
                "Layla merupakan satu dari sekian hero yang ada di permainan Mobile Legends: Bang Bang. Ia adalah hero Marksman yang terkenal karena kemampuan serangannya dari jarak jauh. Hero tersebut memiliki serangan dasar yang kuat, serta kemampuan khusus yang dapat memberikan kerusakan besar pada musuh-musuhnya.",
                R.drawable.icon_laila,
                R.drawable.layla_bg,
                R.drawable.maskman_role,
            ),
            arrayOf(
                "Lancelot",
                "Role: Assasin",
                "Nickname Blade of Roses",
                "Lancelot adalah hero assassin ahli anggar dengan kemampuan sangat baik terutama ketika menyergap lawan. Kecepatan serangannya begitu tinggi dan memberi damage besar. Lancelot berasal dari keluarga Baroque di Land of Dawn. Sejak muda Lancelot terlihat memiliki bakat seni anggar dan sempat sombong dengan kemampuannya.",
                R.drawable.icon_lancelot,
                R.drawable.lancelot_bg,
                R.drawable.assasin_role
            ),
            arrayOf(
                "Leomord",
                "Role: Fighter",
                "Nickname: Sworn Sword",
                "Dengan skill ultimate nya Leomord juga dapat memberikan crowd control jenis pull yang dapat mendorong lawannya. Leomord juga dikenal sebagai hero fighter yang lincah karena memiliki skill blink. Selain itu dengan skill ketiganya yakni Phantom Steed, ia juga dibekali dengan kemampuan movement speed yang sangat cepat.",
                R.drawable.icon_leomord,
                R.drawable.leomord_bg,
                R.drawable.fighter_role
            ),
            arrayOf(
                "Lesley",
                "Role: Marskman",
                "Nickname: Harley Guardian and a Talented Sniper",
                " Lesley adalah hero yang memakai sniper rifle, maka dari itu range attacknya miliknya tentulah sangat jauh. Lesley memiliki burst damage yang tinggi dan baik di kelasnya. Lesley akan seimbang ketika di early game dan juga hingga ke late game.",
                R.drawable.icon_lesley,
                R.drawable.lesley_bg,
                R.drawable.maskman_role,
            ),
            arrayOf(
                "Odette",
                "Role: Mage",
                "Nickname: Swan Princess",
                "Odette merupakan salah satu Hero Mobile Legends bertipe mage yang saat ini keberadaannya jarang muncul di pertandingan. Padahal, Odette memiliki kemampuan yang merepotkan lawan semenjak patch baru hadir. Bayangkan, ultimate-nya tidak bisa digagalkan dengan beberapa tipe crowd control.",
                R.drawable.icon_odette,
                R.drawable.odette_bg,
                R.drawable.mage_role,
            ),
            arrayOf(
                "Valir",
                "Role: Mage",
                "Nickname: Son Of Flame",
                " Valir merupakan hero mage yang mempunyai skill bertipe Area of Effect. Sehingga skill Valir yang dibekali efek slow besar tersebut akan sangat cocok untuk melakukan zoning kepada musuh. Apalagi pasif Valir bisa memberikan efek terbakar yang memberikan magic damage dan stun.",
                R.drawable.icon_valir,
                R.drawable.valir_bg,
                R.drawable.mage_role,
            ),
        )

        val listData: ArrayList<ModelHero>
            get(){

                val list = ArrayList<ModelHero>()
                for (data in database) {
                    val modelHero = ModelHero()
                    modelHero.name = data[0] as String
                    modelHero.role = data[1] as String
                    modelHero.nickname = data[2] as String
                    modelHero.bio = data[3] as String
                    modelHero.pic = data[4] as Int
                    modelHero.background = data[5] as Int
                    modelHero.element = data[6] as Int

                    list.add(modelHero)
                }
                return list
            }
}