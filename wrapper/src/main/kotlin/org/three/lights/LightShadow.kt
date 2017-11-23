@file:JsQualifier("THREE")

package org.three.lights

import org.three.cameras.Camera
import org.three.math.Matrix4
import org.three.math.Vector2

open external class LightShadow {

    constructor(camera: Camera)

    var camera: Camera

    var bias: Double
    var radius: Double

    var mapSize: Vector2

    var matrix: Matrix4

    fun clone() : LightShadow
    fun copy(source: LightShadow) : LightShadow
    fun toJSON() : String
}