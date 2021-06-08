class City{
    private String name;
    private String region;
    private String district;
    private int population;
    private int foundation;

    //constructor from parameters
    City(String name, String region, String district, int population, int foundation){
        this.name        = name;
        this.region      = region;
        this.district    = district;
        this.population  = population;
        this.foundation  = foundation;
    }


    //constructor from string
    City(String str){
        String[] dataSplit = str.split(";");
        this.name        = dataSplit[1];
        this.region      = dataSplit[2];
        this.district    = dataSplit[3];
        this.population  = Integer.parseInt(dataSplit[4]);
        this.foundation  = Integer.parseInt(dataSplit[5]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFoundation() {
        return foundation;
    }

    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';
    }

}