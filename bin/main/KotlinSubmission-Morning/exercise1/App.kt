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
    val firstName: String = "Aditya Mufid"
    val lastName: String = "Musyaffa"
    val age: Int = 21
    val isSingle: Boolean = true
    println("First Name: $firstName\nLast Name: $lastName\nAge: $age\nisSingle: $isSingle\n")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return "Group Name: $groupId\nGroup Member: $groupMember\nSession: $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val lumosTeam: List<String> = listOf("Abdus Salam", "Adelia Sofia Anjani", "Aditya Mufid Musyaffa", "Asfia Apriani", "Lintang Luthfiantoni", "Ali Askari", "Khaeril Maswal Zaid", "Lustiara Mega", "Mutia Nandika", "Sapitri", "Vika Dwi Nur Romadhoni")
    return listOf(lumosTeam[2])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Jovian", "Imam")
    val countOfGroup = arrayOf<String>("Abdus Salam", "Adelia Sofia Anjani", "Aditya Mufid Musyaffa", "Asfia Apriani", "Lintang Luthfiantoni", "Ali Askari", "Khaeril Maswal Zaid", "Lustiara Mega", "Mutia Nandika", "Sapitri", "Vika Dwi Nur Romadhoni").size

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    println(groupDetail("Lumos", listOf("Abdus Salam", "Adelia Sofia Anjani", "Aditya Mufid Musyaffa", "Asfia Apriani", "Lintang Luthfiantoni", "Ali Askari", "Khaeril Maswal Zaid", "Lustiara Mega", "Mutia Nandika", "Sapitri", "Vika Dwi Nur Romadhoni"), "Morning"))

}