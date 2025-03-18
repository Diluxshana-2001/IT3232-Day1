class Task6 {
    String name;
    String regno;
    double[] marks = new double[5];

    public Task6(String name, String regno, double[] marks){
        this.name=name;
        this.regno=regno;
        this.marks=marks;
    }
    public void printDetails(){
        System.out.println("name "+name);
        System.out.println("regno "+regno);
        // System.out.println("average "+Average());
    }

 public class Student {
        public static void main(String[] args) {
            double[] m1 = {90,85,78,68,90};
            double[] m2 = {92,85,78,69,80};
            double[] m3 = {90,55,68,68,70};
            double[] m4 = {80,85,98,58,90};
            double[] m5 = {90,95,75,68,100};

            Task6 s1 = new Task6("John","A001",m1);
            Task6 s2 = new Task6("Josh","A002",m2);
            Task6 s3 = new Task6("Alice","A003",m3);
            Task6 s4 = new Task6("Peter","A004",m4);
            Task6 s5 = new Task6("Mark","A005",m5);

        }
    }
}
