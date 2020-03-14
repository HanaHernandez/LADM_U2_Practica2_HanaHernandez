package mx.edu.ittepic.ladm_u2_practica2_hanahernandez

class Hilo( p : MainActivity) : Thread() {
    var puntero = p
    var cir : Circulo?=null

    override fun run() {
        super.run()
        while (true){
            sleep(200)
            puntero.runOnUiThread {
                puntero.lienzo!!.animar()
            }
        }
    }
}