class ShapePrinter {
    public static void printShape(Shape shape){
        String result = shape.getName() + ((shape instanceof ThreeDShape)? " this is 3D-shape":
                (shape instanceof TwoDShape)?" this is 2D-shape":"");
        System.out.println(result);
    }

    public ShapePrinter() {
    }
}

