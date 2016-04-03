package ac.za.cput.cuanlee.domain;

import javax.jnlp.IntegrationService;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Cuan on 4/3/2016.
 */
public class Motherboard implements Serializable{
    private Long id;
    private String code;
    private String description;
    private CPU cpu;
    private String chipset;
    private List<RAM> ramList;
    private Integer sataPorts;
    private List<HDD> hddList;
    private PSU psu;
    private Integer usb2;
    private Integer usb3;
    private List<GPU> gpuList;
    private FormFactor formFactor;
    private boolean active;

    public Motherboard() {
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public CPU getCpu() {
        return cpu;
    }

    public String getChipset() {
        return chipset;
    }

    public List<RAM> getRamList() {
        return ramList;
    }

    public Integer getSataPorts() {
        return sataPorts;
    }

    public List<HDD> getHddList() {
        return hddList;
    }

    public PSU getPsu() {
        return psu;
    }

    public Integer getUsb2() {
        return usb2;
    }

    public Integer getUsb3() {
        return usb3;
    }

    public List<GPU> getGpuList() {
        return gpuList;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public boolean isActive() {
        return active;
    }


    private Motherboard(Builder builder)
    {
        this.id = builder.id;
        this.code = builder.code;
        this.description = builder.description;
        this.cpu = builder.cpu;
        this.chipset = builder.chipset;
        this.ramList = builder.ramList;
        this.sataPorts = builder.sataPorts;
        this.hddList = builder.hddList;
        this.psu = builder.psu;
        this.usb2 = builder.usb2;
        this.usb3 = builder.usb3;
        this.gpuList = builder.gpuList;
        this.formFactor = builder.formFactor;
        this.active = builder.active;
    }

    public static class Builder{
        private Long id;
        private String code;
        private String description;
        private CPU cpu;
        private String chipset;
        private List<RAM> ramList;
        private Integer sataPorts;
        private List<HDD> hddList;
        private PSU psu;
        private Integer usb2;
        private Integer usb3;
        private List<GPU> gpuList;
        private FormFactor formFactor;
        private boolean active;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder code(String value)
        {
            this.code = value;
            return this;
        }

        public Builder description(String value)
        {
            this.description = value;
            return this;
        }

        public Builder cpu(CPU value)
        {
            this.cpu = value;
            return this;
        }

        public Builder chipset(String value)
        {
            this.chipset = value;
            return this;
        }

        public Builder ramList(List<RAM> value)
        {
            this.ramList = value;
            return this;
        }

        public Builder sataPorts(Integer value)
        {
            this.sataPorts = value;
            return this;
        }

        public Builder hddList(List<HDD> value)
        {
            this.hddList = value;
            return this;
        }

        public Builder psu(PSU value)
        {
            this.psu = value;
            return this;
        }

        public Builder usb2(Integer value)
        {
            this.usb2 = value;
            return this;
        }

        public Builder usb3(Integer value)
        {
            this.usb3 = value;
            return this;
        }

        public Builder gpuListgpu(List<GPU> value)
        {
            this.gpuList = value;
            return this;
        }

        public Builder formFactor(FormFactor value)
        {
            this.formFactor = value;
            return this;
        }

        public Builder active(boolean value)
        {
            this.active = value;
            return this;
        }

        public Builder copy(Motherboard value)
        {
            this.id = value.id;
            this.code = value.code;
            this.description = value.description;
            this.cpu = value.cpu;
            this.chipset = value.chipset;
            this.ramList = value.ramList;
            this.sataPorts = value.sataPorts;
            this.hddList = value.hddList;
            this.psu = value.psu;
            this.usb2 = value.usb2;
            this.usb3 = value.usb3;
            this.gpuList = value.gpuList;
            this.formFactor = value.formFactor;
            this.active = value.active;

            return this;
        }

        public Motherboard build(){
            return new Motherboard(this);
        }
    }
}
