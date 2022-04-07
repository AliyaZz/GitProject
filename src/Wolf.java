public class Wolf {
    private float rost;
    private int ves;
    private String name;
    private boolean run = false;
    private int ages;

    public Wolf(float rost, int ves, String name, int ages) {
        this.rost = rost;
        this.ves = ves;
        this.name = name;
        this.ages = ages;
    }




    public float getRost() {
        return rost;
    }

    public int getVes() {
        return ves;
    }

    public String getName() {
        return name;
    }
    public int getAges() {
        return ages;
    }

    public void isRun() {
        this.run = true;
    }

    public String getRun() {
        if (run) {
            return "Он бежит";
        } else return "Он стоит";

    }
    public void NextYear(){
        this.ages++;
    }

    public void Woo() {
        System.out.println("Woooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
    }
}

