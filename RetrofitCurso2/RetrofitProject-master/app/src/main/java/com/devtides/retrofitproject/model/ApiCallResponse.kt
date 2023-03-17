package com.devtides.retrofitproject.model

data class ApiCallResponse (
    val TractoHead: Map<String, String>?,
    val DatosTracto: Map<String, String>?,
    val InterTracto: Map<String, String>?
){
    fun flatten():List<Item>{
        val flatpack = arrayListOf<Item>()
        TractoHead?.let {
            if (!TractoHead.values.isEmpty()){
                flatpack.add(Item("TractoHead", "", TYPE_CATEGORY))
                addMapItems(TractoHead, flatpack)
            }
        }

        DatosTracto?.let {
            if (!DatosTracto.values.isEmpty()){
                flatpack.add(Item("DatosTracto", "", TYPE_CATEGORY))
                addMapItems(DatosTracto, flatpack)
            }
        }

        InterTracto?.let {
            if (!InterTracto.values.isEmpty()){
                flatpack.add(Item("InterTracto", "", TYPE_CATEGORY))
                addMapItems(InterTracto, flatpack)
            }
        }
        return flatpack
    }

    private fun addMapItems(map: Map<String, String>, flatpack:ArrayList<Item>){
        for (key :String in map.keys){
            flatpack.add(Item(key, map.getValue(key), TYPE_ITEM))
        }
    }
}