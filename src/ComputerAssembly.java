public class ComputerAssembly {

    Computer computer;
    Procesor procesor;
    Memory memory;

    ComputerAssembly(Computer computer, Procesor procesor, Memory memory)
    {

        this.computer = computer;
        this.procesor = procesor;
        this.memory = memory;
    }

    Computer assembly()
    {

        computer.procesor.producer = procesor.producer;
        computer.procesor.model = procesor.model;
        computer.procesor.clocksignal = procesor.clocksignal;
        computer.memory.producer = memory.producer;
        computer.memory.model = memory.model;
        computer.memory.clocksignal = memory.clocksignal;
        return computer;
    }
}
