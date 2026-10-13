class Student {

    public void avgMarks(int s1, int s2) {
        double avg = (s1 + s2) / 2.0;
        System.out.println(avg);
    }

    public void avgMarks(int s1, int s2, int s3) {
        double avg = (s1 + s2 + s3) / 3.0;
        System.out.println(avg);
    }

    public static void main(String args[]) {
        Student s = new Student();

        s.avgMarks(70, 92);
        s.avgMarks(91, 95, 96);
    }
}