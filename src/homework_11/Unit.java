package homework_11;

public enum Unit {
    METER("m") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    },
    KILOGRAM("kg") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    },
    SECOND("sec") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    },
    AMPERE("A") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    },
    KELVIN("K") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    },
    MOLE("mole") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    },
    CANDELA("candela") {
        @Override
        public String getBaseUnit() {
            return this.getUnit();
        }
    };

    private final String unit;
    Unit (String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }

    public abstract String getBaseUnit();
}
