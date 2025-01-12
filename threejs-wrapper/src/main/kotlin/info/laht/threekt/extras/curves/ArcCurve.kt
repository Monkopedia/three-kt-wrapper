@file:JsQualifier("THREE")

package info.laht.threekt.extras.curves

open external class ArcCurve(
    aX: Number = definedExternally,
    aY: Number = definedExternally,
    xRadius: Number = definedExternally,
    yRadius: Number = definedExternally,
    aStartAngle: Number = definedExternally,
    aEndAngle: Number = definedExternally,
    aClockwise: Number = definedExternally
) : EllipseCurve {

    override fun clone(): ArcCurve
    fun copy(curve: ArcCurve): ArcCurve
}
