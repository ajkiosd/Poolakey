package ir.cafebazaar.poolakey.exception

class BazaarNotFoundException : IllegalStateException() {

    override val message: String?
        get() = "Myket is not installed"

}
