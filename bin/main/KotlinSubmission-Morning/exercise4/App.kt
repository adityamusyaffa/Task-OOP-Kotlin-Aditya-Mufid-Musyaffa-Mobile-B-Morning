package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        val hasilPembagian = pembagian(100, 0)
        println(hasilPembagian)
    } catch (e: Throwable) {
        println("Pembagian Error: ${e.message}")
    }
}

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun pembagian(angka: Long, pembagi: Long): Long {
        if (pembagi == 0L) {
            throw ArithmeticException("Tidak bisa dibagi dengan 0")
        }
        return angka / pembagi
    }