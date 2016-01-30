package com.github.vincentdaniel.util

/**
  * TypeSafeEqualOps brings type safe equality methods (==== and !===)
  */
object TypeSafeEqualOps {

  final case class Comparator[T](t: T) {
    def ====(other: T): Boolean = t == other

    def !===(other: T): Boolean = t != other
  }

  implicit def typeToComparator[T](any: T): Comparator[T] = Comparator(any)

}
