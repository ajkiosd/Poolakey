package ir.cafebazaar.poolakey.exception

class BazaarNotSupportedException : IllegalStateException() {

    override val message: String?
        get() = "Myket is not updated"

}
