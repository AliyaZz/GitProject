public class Vector {
    double x;
    double y;
    double z;
    public Vector(double x, double y, double z){
        this.z=z;
        this.x=x;
        this.y=y;
    }
    public double sum(int x,int y,int z) {
        double sum1 = Math.sqrt(x * x + z * z + y * y);
        return sum1;
    }
    public double scal (Vector vector){
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    public static Vector[] generate(int n){
        Vector[] s = new Vector[n];
        for (int i = 0; i<n;i++){
            s[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return s;
    }
    public String toStr () {
        return "Vector{ x = "+x+", y = "+y+", z = "+z+"}";
    }


    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0].toStr());
        System.out.println(vectors[1].toStr());
        System.out.println(vectors[2].toStr());
        System.out.println(vectors[3].toStr());
        System.out.println(vectors[4].toStr());
        System.out.println(vectors[5].toStr());
        System.out.println(vectors[6].toStr());
        System.out.println(vectors[7].toStr());
        System.out.println(vectors[8].toStr());
        System.out.println(vectors[9].toStr());
    }

}
