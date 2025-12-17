package Day_3;

import java.util.Scanner;

class _2D {
    double l, w;
    _2D(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double getCost() {
        return l * w * 40;
    }
}

class _3D extends _2D {
    double h;
    _3D(double l, double w, double h) {
        super(l, w);
        this.h = h;
    }
    double getCost() {
        return l * w * h * 60;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        _2D two = new _2D(l, w);
        _3D three = new _3D(l, w, h);

        System.out.println("Cost of 2D: Rs " + two.getCost());
        System.out.println("Cost of 3D: Rs " + three.getCost());
    }
}
