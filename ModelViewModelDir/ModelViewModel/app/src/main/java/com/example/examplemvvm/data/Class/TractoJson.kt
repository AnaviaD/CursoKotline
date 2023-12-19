package com.example.examplemvvm.data.Class

import com.example.intercambio.clases.Tracto.FotosTracto
import com.example.intercambio.clases.Tracto.Notificaciones

data class TractoJson(
    val DatosTracto     : DatosTracto,
    val FotosCaja1      : List<FotosTracto>?,
    val FotosCaja2      : List<FotosTracto>?,
    val FotosTracto     : List<FotosTracto>?,
    val InterTracto     : InterTracto,
    val LlantasTracto   : List<LlantasTracto>?,
    val Notificar       : Notificaciones,
    val TractoHead      : TractoHead
)