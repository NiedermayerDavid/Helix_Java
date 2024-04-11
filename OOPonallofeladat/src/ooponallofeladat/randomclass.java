
package ooponallofeladat;

public class randomclass {
    
    private String valamiStr1;
    private Integer valamiInt1;
    private Double valamiDouble1;
    private String valamiStr2;
    private Integer valamiInt2;
    private Double valamiDouble2;
    
    //konstruktor
    public randomclass(String valamiStr1, Integer valamiInt1, Double valamiDouble1, String valamiStr2, Integer valamiInt2, Double valamiDouble2){
        this.valamiDouble1 = valamiDouble1;
        this.valamiDouble2 = valamiDouble2;
        this.valamiInt1 = valamiInt1;
        this.valamiInt2 = valamiInt2;
        this.valamiStr1 = valamiStr1;
        this.valamiStr2 = valamiStr2;
    }
    
    //getters
    public String getValamiStr1() {
        return this.valamiStr1;
    }

    public Integer getValamiInt1() {
        return this.valamiInt1;
    }

    public Double getValamiDouble1() {
        return this.valamiDouble1;
    }

    public String getValamiStr2() {
        return this.valamiStr2;
    }

    public Integer getValamiInt2() {
        return this.valamiInt2;
    }

    public Double getValamiDouble2() {
        return this.valamiDouble2;
    }
    //setters

    public void setValamiInt1(Integer newValamiInt1) {
        this.valamiInt1 = newValamiInt1;
    }

    public void setValamiStr2(String newValamiStr2) {
        this.valamiStr2 = newValamiStr2;
    }

    public void setValamiDouble2(Double newValamiDouble2) {
        this.valamiDouble2 = newValamiDouble2;
    }
    
    
    
    
}
