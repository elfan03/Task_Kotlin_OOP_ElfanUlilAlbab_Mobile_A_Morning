package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    fun main() {
        pengecualianPenanganan()

    }
    fun pengecualianPenanganan() {
        val nama: String? = null
        lateinit var namaNotNull: String

        try {
            namaNotNull = nama!!
            println(namaNotNull)
        } catch (e: Exception) {
            namaNotNull = "Nama bernilai Null"
            println(namaNotNull)
        }
    }


