package Day_3;

import java.util.Scanner;

class plate {
    double length, width;
    plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate: length=" + length + ", width=" + width);
    }
}

class box extends plate {
    double height;
    box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box: height=" + height);
    }
}

class woodbox extends box {
    double thick;
    woodbox(double length, double width, double height, double thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("Woodbox: thick=" + thick);
    }
}

class Wood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions(length,width,height,thickness):");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        woodbox wb = new woodbox(l, w, h, t);
    }
}
