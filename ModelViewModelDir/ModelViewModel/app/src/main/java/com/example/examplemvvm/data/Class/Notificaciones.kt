package com.example.intercambio.clases.Tracto


data class Notificaciones(
    public var NotiMantenimiento:   Int,
    public var NotiOpSaltillo:  Int,
    public var NotiOpToluca:    Int,
    public var NotiOpMexico:    Int,
    public var NotiOpSLP:   Int,
    public var NotiCajaTol: Int,
    public var NotiCajaSal: Int,
    public var NotiCajaMex: Int,
    public var NotiCajaSLP: Int,
    public var NotiRegTol:  Int,
    public var NotiRegSal:  Int,
    public var NotiRegMex:  Int,
    public var NotiRegSLP:  Int,
    public var NotiCompras: Int,
    public var NotiControl: Int,
    public var NotiOperaciones: Int,
    public var NotiComercial:   Int,
    public var NotiGerGral: Int,
    public var MenNotifica: String,
    public var NotificaDiff:    Int,
    public var NotiIntercamTol: Int,
    public var NotiIntercamSal: Int,
    public var NotiIntercamSLP: Int,
    public var NotiIntercamMex: Int,
    public var IncluirFotos:    Int
)