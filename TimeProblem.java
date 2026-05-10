public class TimeProblem {

    int h, m, s;

    TimeProblem(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    int toSecond() {
        return h * 3600 + m * 60 + s;
    }

    void fromSecond(int total) {
        h = total / 3600;
        total %= 3600;
        m = total / 60;
        s = total % 60;
    }

    void addSecond(int sec) {
        int total = toSecond();
        total += sec;
        fromSecond(total);
    }

    void subtractSecond(int sec) {
        int total = toSecond();
        total -= sec;

        if (total < 0) total = 0;

        fromSecond(total);
    }

    void display() {
        System.out.printf("%02d : %02d : %02d\n", h, m, s);
    }

    public static void main(String[] args) {
        TimeProblem t = new TimeProblem(2, 30, 45);

        t.addSecond(50);
        System.out.print("Time after adding seconds = ");
        t.display();

        t.subtractSecond(30);
        System.out.print("Time after subtracting seconds = ");
        t.display();
    }
}