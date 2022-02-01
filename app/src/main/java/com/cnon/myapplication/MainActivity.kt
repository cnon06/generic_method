package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


abstract class geometrikSekil()
{
    abstract fun alanHesapla() : Int
}


class kare(var en: Int) : geometrikSekil()
{

    override fun alanHesapla() : Int
    {
        return en*en
    }

}


class dikDortgen(var en: Int, var boy: Int) : geometrikSekil()
{

    override fun alanHesapla() : Int
    {
        return en*boy
    }

}






class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kare1=kare(5)
        var kare2=kare(6)

        //println("Büyük karenin alanı: ${kareAlanKarsilastir(kare1,kare2)}")


        println("Büyük karenin alanı: ${genericAlanKarsilastir(kare1,kare2).alanHesapla()}")

        var dikDortgen1=dikDortgen(5,6)
        var dikDortgen2=dikDortgen(7,8)


        println("Büyük dikdörtgenin alanı: ${genericAlanKarsilastir(dikDortgen1,dikDortgen2).alanHesapla()}")
      //  println("Büyük dikdörtgenin alanı: ${dikDortgenAlanKarsilastir(dikDortgen1,dikDortgen2)}")




    }

    fun <genel:geometrikSekil> genericAlanKarsilastir(generic11:genel, generic22:genel) : genel
    {
        if(generic11.alanHesapla()>generic22.alanHesapla()) return generic11
        else return generic22
    }
    
    /*
     fun kareAlanKarsilastir(kare11:kare,kare22:kare) : Int
    {
       if(kare11.alanHesapla()>kare22.alanHesapla()) return kare11.alanHesapla()
        else return kare22.alanHesapla()
    }



    fun dikDortgenAlanKarsilastir(dikDortgen11:dikDortgen,dikDortgen22:dikDortgen) : Int
    {
        if(dikDortgen11.alanHesapla()>dikDortgen22.alanHesapla()) return dikDortgen11.alanHesapla()
        else return dikDortgen22.alanHesapla()
    }
     */

    
}