@file:JsQualifier("THREE")

package info.laht.threekt.extras.curves

import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector3

open external class QuadricBezierCurve3 : Curve<Vector3> {

    constructor(
        v0: Vector3 = definedExternally,
        v1: Vector3 = definedExternally,
        v2: Vector3 = definedExternally
    )

    override fun clone(): QuadricBezierCurve3
    fun copy(curve: QuadricBezierCurve3): QuadricBezierCurve3
}
