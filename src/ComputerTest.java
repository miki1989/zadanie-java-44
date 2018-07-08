public class ComputerTest {
    public static void main(String[] args) {
        Procesor proc1 = new Procesor("Intel","72", 1);
        Procesor proc2 = new Procesor("Lenovo","GG", 5);
        Memory mem1 = new Memory("Nvidia","Bravo", 2);
        Memory mem2 = new Memory("Gforce", "XX", 10);

        Computer comp1 = new Computer("Asus",proc1, mem1);
        System.out.println("Computer number 1: " + comp1.name + " " + comp1.procesor.producer + " " + comp1.procesor.model + " " +
                comp1.procesor.clocksignal + " " + comp1.memory.producer + " " + comp1.memory.model + " " + comp1.memory.clocksignal);
        Computer comp2 = new Computer("Toshiba", proc2, mem2);
        System.out.println("Computer number 2: " + comp2.name + " " + comp2.procesor.producer + " " + comp2.procesor.model + " "
        + comp2.procesor.clocksignal + " " + comp2.memory.producer + " " + comp2.memory.model + " " + comp2.memory.clocksignal);

        Overclock over1 = new Overclock();
        System.out.println("Computer number 1 after acceleration: " + over1.increaseCPuClock(comp1,1.9));
        System.out.println("Computer number 2 after acceleration: " + over1.increaseCPuClock(comp2, 2.2));
        System.out.println();
        System.out.printf("Clock signal of computer number 1 after reduction: %.2f\n", over1.decreaseCPuClock(comp1, 1.6));
        System.out.printf("Clock signal of computer number 2 after reduction: %.2f", over1.decreaseCPuClock(comp1, 3));

        System.out.println();
        ComputerAssembly compAss = new ComputerAssembly(comp2,proc1,mem2);
        System.out.println(compAss.assembly());
    }
}
