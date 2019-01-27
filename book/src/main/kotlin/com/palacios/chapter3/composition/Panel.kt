package com.palacios.chapter3.composition

class Panel (val rectangle: Rectangle) : UIElement by rectangle