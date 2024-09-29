public class complex {
    int x, y;
    public complex() {
        this.x = 0;
        this.y = 1;
    }
    public complex(int a, int b) {
        this.x = a;
        this.y = b;
    }
    public double module() {
        return Math.round(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)) * 100.0) / 100.0;
    }
    public double arg() {
        if (this.x > 0) {
            return Math.round(Math.atan((double) this.y / this.x) * 100.0) / 100.0;
        }
        else if (this.x == 0) {
            if (this.y > 0) {
                return 1.57;
            }
            else if (this.y == 0) {
                return 0;
            }
            else {
                return -1.57;
            }
        }
        else {
            if (this.y >= 0) {
                return 3.14 + Math.round(Math.atan((double) this.y / this.x) * 100.0) / 100.0;
            }
            else {
                return -3.14 + Math.round(Math.atan((double) this.y / this.x) * 100.0) / 100.0;
            }
        }
    }
    public complex sum(complex z) {
        return new complex(this.x + z.x, this.y + z.y);
    }
    public void print() {
        if (this.y == 0){
            System.out.println(this.x);
        }
        else if (this.x == 0){
            System.out.println(this.y + "i");
        }
        else if (this.y > 0) {
            System.out.println(this.x + "+" + this.y + "i");
        }
        else {
            System.out.println(this.x + "-" + Math.abs(this.y) + "i");
        }
    }
}
