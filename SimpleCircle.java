class SimpleCircle{
    double radius;
    
    SimpleCircle(){
        radius = 10;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
          return 2*radius*Math.PI;
    }
}
