
package com.example.roomsiswa.view.uicontroller

import com.example.roomsiswa.R

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}
