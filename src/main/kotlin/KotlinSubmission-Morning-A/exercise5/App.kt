package id.infinitelearning.KotlinSubmission.exercise5

class AppHero(var nama: String, var umur: Int, var tinggibadan: Double) {

    var bangunCount: Int =0
    var mandiCount: Int = 0
    var masakCount: Int = 0
    var makanCount: Int = 0
    var minumCount: Int = 0
    var strechingCount: Int = 0
    var dudukCount: Int = 0

    fun setProfile(nama: String, umur: Int, tinggibadan: Double) {
        this.nama = nama
        this.umur = umur
        this.tinggibadan = tinggibadan
    }

    fun showProfile() {
        println("halo selama datang di my Profile")
        println("Nama: $nama")
        println("Umur: $umur")
        println("Height: $tinggibadan")
        println()
    }

    fun bangun() {
        bangunCount += 1
    }
    fun mandi() {
        mandiCount += 1
    }

    fun masak() {
        masakCount += 1
    }

    fun makan() {
        makanCount += 2
    }

    fun minum() {
        minumCount += 2
    }

    fun streching() {
        strechingCount += 1
    }

    fun duduk() {
        dudukCount += 2
    }

    fun showActivityStatus() {
        println("Activity Status:")
        println("Bangun Count: $bangunCount times")
        println("Mandi Count: $mandiCount times")
        println("Masak Count: $masakCount times")
        println("Makan Count: $makanCount times")
        println("Minum Count: $minumCount times")
        println("Streching Count: $strechingCount times")
        println("Duduk Count: $dudukCount times")
        println()
    }
}

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = AppHero("Elfan Ulil Albab", 22, 177.0)

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Elfan Ulil Albab", 22, 177.0)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     *
     */
    hero.showProfile()


    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    hero.bangun()
    hero.mandi()
    hero.masak()
    hero.makan()
    hero.minum()
    hero.streching()
    hero.duduk()


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.showActivityStatus()

}
