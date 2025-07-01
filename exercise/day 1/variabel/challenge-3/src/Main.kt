//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        print("Nama mahasiswa: ")
        val nama = readLine() ?: ""
        print("Mahasiswa aktif? (true/false): ")
        val aktif: Boolean = readLine()?.toBoolean() ?: false

        println("Nama: $nama")
        println("Mahasiswa Aktif: $aktif")

}