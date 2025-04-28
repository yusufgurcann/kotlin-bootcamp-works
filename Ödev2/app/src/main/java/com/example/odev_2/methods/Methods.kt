package com.example.odev_2.methods

fun main() {

    val fahrenheit = fahrenhietaHesapla(30.0)
    println("Fahrenheit: $fahrenheit")

    val cevre = cevreHesapla(20.0,30.0)
    println("Çevre: $cevre")

    val faktoriyelSonucu = factoriyel(5)
    println("Faktoriyel sonucu: $faktoriyelSonucu")

    val harfSayisi = harfSayisiA("Merhaba Dünya")
    println("$harfSayisi adet 'a' harfi bulundu.")

    val icAciToplami = icAciToplamHesapla(5)
    println("İç açılar toplamı: $icAciToplami")

    val maas = maasHesapla(20)
    println("Toplam Maaş: $maas")

    val kotaUcreti = kotaUcretHesapla(60)
    println("Toplam Kota Ücreti: $kotaUcreti")
}
fun fahrenhietaHesapla(derece: Double) : Double {
    return derece * 1.8 + 32
}

fun cevreHesapla(kisaKenar: Double, uzunKenar: Double) : Double{
    return 2 * (kisaKenar + uzunKenar)
}

fun factoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun harfSayisiA(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

fun icAciToplamHesapla(kenarSayisi: Int) : Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int) : Int{
    val calismaSaati = 8
    val saatUcreti = 10
    val mesaiUcreti = 20
    return if (calismaSaati <= 160) {
        calismaSaati * saatUcreti
    } else {
        val  normalSaat = 160
        val mesaiSaat = calismaSaati - 160
        (normalSaat * saatUcreti) + (mesaiSaat * mesaiUcreti)
    }
}

fun kotaUcretHesapla(kota: Int) : Int {
    val anaUcret = 100
    val kotaSiniri = 50
    val fazlaGBucreti = 4

    return if (kota <= kotaSiniri) {
        anaUcret
    } else {
        anaUcret + (kota - kotaSiniri) * fazlaGBucreti
    }
}