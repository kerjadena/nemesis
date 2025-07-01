fun main() {
    val USER = "admin"
    val PASS = "1234"

    print("Username: ")
    val inputUser = readLine() ?: ""
    print("Password: ")
    val inputPass = readLine() ?: ""

    if (inputUser == USER && inputPass == PASS) {
        println("Login berhasil!")
    } else {
        println("Username/password salah.")
    }
}
