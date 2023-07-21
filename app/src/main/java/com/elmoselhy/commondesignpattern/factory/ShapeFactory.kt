package com.elmoselhy.commondesignpattern.factory

class ShapeFactory {
    fun getShape(shapeType: Int): Shape? {// 1 for circle,2 for square
        return when (shapeType) {
            1 -> Circle()
            2 -> Square()
            else -> null
        }
    }
}