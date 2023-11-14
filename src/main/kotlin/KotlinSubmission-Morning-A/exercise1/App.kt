package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    val firstName: String = "Elfan"
    val midleName: String ="Ulil"
    val lastName: String = "Albab"
    val age: Int = 22
    val isSingle: Boolean = false

    // Cetak setiap variabel ke layar
    println("Nama Depan: $firstName")
    println("Nama Tengah:$midleName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama Group: $groupId")
    println("Anggota Group: $groupMember")
    println("Sesi: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 **/


fun myTeam(): List<Any> {
    val teamMembers = listOf("Elfan Ulil Albab" ,"Desi","Aditya","Ahmad","Ray")
    println("My team members: $teamMembers")
    return listOf()
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 **/


fun totalMember(): Int {
    val mentor = arrayOf("Kakak Pupu", "Kak Joy", "Mentor3")
    val countOfGroup = arrayOf("Elfan Ulil Albab" ,"Desi","Aditya","Ahmad","Ray")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = "Codenesia"
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

/**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     **/


    groupDetail("Codenesia", listOf("Elfan Ulil Albab" ,"Desi","Aditya","Ahmad","Ray"), "Morning kelas A")

}
