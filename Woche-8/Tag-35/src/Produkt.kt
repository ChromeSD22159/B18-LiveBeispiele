import java.time.LocalDate

class Produkt(
    val name: String,
    val preis: Double,
    val lieferungsDatum: LocalDate
){
    val kaufDatum: LocalDate? = null

}