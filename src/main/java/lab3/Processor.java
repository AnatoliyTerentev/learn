package lab3;

public class Processor {
    private String modelCpu;
    private int core;
    private double hzCpu;

    Processor(String modelCpu, int core, double hzCpu) {
        this.modelCpu = modelCpu;
        this.core = core;
        this.hzCpu = hzCpu;
    }


    public String getModelCpu() {
        return modelCpu;
    }

    public void setModelCpu(String modelCpu) {
        this.modelCpu = modelCpu;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public double getHzCpu() {
        return hzCpu;
    }

    public void setHzCpu(double hzCpu) {
        this.hzCpu = hzCpu;
    }

    @Override
    public String toString() {
        return "CPU: " + modelCpu + ", cores: " + core + "@" + hzCpu + "Hz";
    }
}

