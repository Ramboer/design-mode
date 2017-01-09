package com.liu.mode.struct.facade;

/**
 * Created by simon.liu on 2017/1/9.
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;
    /**
     * constructor
     */
    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    /**
     * start computer.
     */
    public void startComputer() {
        cpu.startCpu();
        memory.startMemory();
        disk.startDisk();
    }

    /**
     * shut down computer
     */
    public void shutDownComputer() {
        cpu.shutdown();
        memory.shutDownMemory();
        disk.shutDownDisk();
    }
}
