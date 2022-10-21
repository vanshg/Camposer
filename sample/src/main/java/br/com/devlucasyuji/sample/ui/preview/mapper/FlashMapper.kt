package br.com.devlucasyuji.sample.ui.preview.mapper

import br.com.devlucasyuji.camposer.state.FlashMode
import br.com.devlucasyuji.sample.ui.preview.model.Flash

fun Flash.toFlashMode() = when (this) {
    Flash.Auto -> FlashMode.Auto
    Flash.On -> FlashMode.On
    Flash.Off -> FlashMode.Off
}

fun FlashMode.toFlash() = when (this) {
    FlashMode.On -> Flash.On
    FlashMode.Auto -> Flash.Auto
    FlashMode.Off -> Flash.Off
}
