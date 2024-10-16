package com.wan.myunittest

class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference(): Double = cuboidModel.getCircumference()
    fun getSurfaceArea(): Double = cuboidModel.getSurfaceArea()
    fun getVolume(): Double = cuboidModel.getVolume()
    fun save(width: Double, length: Double, height: Double) {
        cuboidModel.save(width, length, height)
    }
}