package ac.za.cput.cuanlee.domain;

import java.io.Serializable;

/**
 * Created by Cuan on 4/3/2016.
 */
public class HDD implements Serializable {
    private Long id;
    private String code;
    private String description;
    private double size_MB;
    private double rpm;
    private boolean sata;
    private boolean active;

    public HDD() {
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

    public double getSize_MB() {
        return size_MB;
    }

    public double getRpm() {
        return rpm;
    }

    public boolean getSata() {
        return sata;
    }

    public boolean isActive() {
        return active;
    }


    private HDD(Builder builder)
    {
        this.id = builder.id;
        this.code = builder.code;
        this.description = builder.description;
        this.size_MB = builder.size_MB;
        this.rpm = builder.rpm;
        this.sata = builder.sata;
        this.active = builder.active;
    }

    public static class Builder{
        private Long id;
        private String code;
        private String description;
        private double size_MB;
        private double rpm;
        private boolean sata;
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

        public Builder size_MB(double value)
        {
            this.size_MB = value;
            return this;
        }

        public Builder rpm(double value)
        {
            this.rpm = value;
            return this;
        }

        public Builder sata(boolean value)
        {
            this.sata = value;
            return this;
        }

        public Builder active(boolean value)
        {
            this.active = value;
            return this;
        }

        public Builder copy(HDD value)
        {
            this.id = value.id;
            this.code = value.code;
            this.description = value.description;
            this.size_MB = value.size_MB;
            this.rpm = value.rpm;
            this.sata = value.sata;
            this.active = value.active;

            return this;
        }

        public HDD build(){
            return new HDD(this);
        }
    }
}
