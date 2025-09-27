package advance.ch1_제네릭_변성_제어자

// Ch1Part3

interface Ch1Part3Message

// in 제어자 반공변
interface Ch1Part3Sender<in T : Ch1Part3Message> {
    fun send(message: T)
}

interface Ch1Part3OrderManagerMessage : Ch1Part3Message
interface Ch1Part3InvoiceManagerMessage : Ch1Part3Message

class Ch1Part3AddOrder(val order: String) : Ch1Part3OrderManagerMessage
class Ch1Part3CancelOrder(val orderId: String) : Ch1Part3OrderManagerMessage
class Ch1Part3MakeInvoice(val orderId: String) : Ch1Part3InvoiceManagerMessage

class GeneralSenderCh1Part3(
    val serviceUrl: String,
) : Ch1Part3Sender<Ch1Part3Message> {
    private fun connection(message: Ch1Part3Message) {
        println("$serviceUrl : $message")
    }

    override fun send(message: Ch1Part3Message) {
        connection(message)
    }

}

val orderManagerSenderCh1Part3: Ch1Part3Sender<Ch1Part3OrderManagerMessage>
= GeneralSenderCh1Part3("http://order-service")

val invoiceManagerSenderCh1Part3: Ch1Part3Sender<Ch1Part3InvoiceManagerMessage>
= GeneralSenderCh1Part3("http://order-service")