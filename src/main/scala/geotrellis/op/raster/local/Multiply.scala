package geotrellis.op.raster.local

import geotrellis._
import geotrellis.op._

/**
 * Multiply each cell of each raster.
 */
case class Multiply(rs:Op[Raster]*) extends MultiLocal {
  final def ops = rs.toArray
  final def handle(a:Int, b:Int) = if (a == NODATA) NODATA else if (b == NODATA) NODATA else a * b
  final def handleDouble(a:Double, b:Double) = a * b
}

/**
 * Multiply each cell of each raster in array.
 */
case class MultiplyArray(op:Op[Array[Raster]]) extends MultiLocalArray {
  final def handle(a:Int, b:Int) = if (a == NODATA) NODATA else if (b == NODATA) NODATA else a * b
  final def handleDouble(a:Double, b:Double) = a * b
}
