public class Overclock {
    double accelerator;

    double increaseCPuClock(Computer computer, double accelerator)
    {
        return computer.procesor.clocksignal = computer.procesor.clocksignal + accelerator;
    }

    double decreaseCPuClock(Computer computer, double accelerator)
    {
        return computer.procesor.clocksignal = computer.procesor.clocksignal - accelerator;
    }
}
